package mall_builder.implementare;

import java.util.ArrayList;
import java.util.List;

public class Magazin {
    private String denumire;
    private double suprafata;
    private int nrIntrari;
    private double duritate;
    private boolean podeaPersonalizata;
    private List<TipuriDecoratiuni> decoratiuni;

    private Magazin(String denumire, double suprafata, int nrIntrari, double duritate, boolean podeaPersonalizata, List<TipuriDecoratiuni> decoratiuni) {
        this.denumire = denumire;
        this.suprafata = suprafata;
        this.nrIntrari = nrIntrari;
        this.duritate = duritate;
        this.podeaPersonalizata = podeaPersonalizata;
        this.decoratiuni = decoratiuni;
    }

    public static MagazinBuilder getBuilder(String denumire, double suprafata, int nrIntrari){
        return new MagazinBuilder(denumire, suprafata, nrIntrari);
    }

    @Override
    public String toString() {
        return "Magazin{" +
                "denumire='" + denumire + '\'' +
                ", suprafata=" + suprafata +
                ", nrIntrari=" + nrIntrari +
                ", duritate=" + duritate +
                ", podeaPersonalizata=" + podeaPersonalizata +
                ", decoratiuni=" + decoratiuni +
                '}';
    }

    public static class MagazinBuilder implements IBuilder {
        private String denumire;
        private double suprafata;
        private int nrIntrari;
        private double duritate;
        private boolean podeaPersonalizata;
        private List<TipuriDecoratiuni> decoratiuni;


        public MagazinBuilder(String denumire, double suprafata, int nrIntrari) {
            this.denumire = denumire;
            this.suprafata = suprafata;
            this.nrIntrari = nrIntrari;
            this.podeaPersonalizata=false;
        }

        @Override
        public Magazin build() {
            if(nrIntrari<getNrObligatoriuIntrari()){
                throw new RuntimeException("Prea putine intrari");
            }
            if(!verificareDecoratiuni()){
                throw new RuntimeException("Decoratiune de sticla nepermisa");
            }
            if(calculGradIncendiu()>10){
                throw new RuntimeException("Grad incendiu periculos");
            }

            Magazin rezultat = new Magazin(denumire,suprafata,nrIntrari,duritate,podeaPersonalizata,decoratiuni);
            this.duritate=0;
            this.podeaPersonalizata=false;
            this.decoratiuni=null;

            return rezultat;
        }


        public MagazinBuilder setPodeaPersonalizataSiDuritate(boolean podeaPersonalizata,double duritate) {
            this.podeaPersonalizata = podeaPersonalizata;
            this.duritate=duritate;
            return this;
        }

        private int getNrObligatoriuIntrari(){
            int intrariObligatorii=(int)(suprafata/100);
            return intrariObligatorii;
        }

        private boolean verificareDecoratiuni(){
            if(podeaPersonalizata && duritate<2 && decoratiuni!=null){
                for(TipuriDecoratiuni d:decoratiuni){
                    if(d==TipuriDecoratiuni.STICLA){
                        return false;
                    }
                }
            }
            return true;
        }

        private double calculGradIncendiu(){
            double grad=0;
            if(podeaPersonalizata) {
                grad += (5 - duritate);

            }
            if(decoratiuni!=null) {
                for (TipuriDecoratiuni d : decoratiuni) {
                    switch (d) {
                        case STICLA:
                            grad += 1;
                        case LEMN:
                            grad += 2;
                        case MATERIAL_TEXTIL:
                            grad += 3;
                        case METAL:
                            grad += 1;
                    }
                }
            }
            return grad;
        }

        public MagazinBuilder addDecoratiune(TipuriDecoratiuni decoratiune){
            if(this.decoratiuni!=null){
                decoratiuni.add(decoratiune);
            } else {
                this.decoratiuni=new ArrayList<>();
                decoratiuni.add(decoratiune);
            }
            return this;
        }

    }
}
