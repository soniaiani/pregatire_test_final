package cafenea_prototype.implementare;

import java.util.ArrayList;
import java.util.List;

public class Ceai extends AbstractBautura{
    public Ceai(String nume, float volum, float pret, List<String> pasiPreparare) {
        super(nume, volum, pret, pasiPreparare);
    }

    public Ceai() {

    }

    @Override
    public void preparare() {
        System.out.println("Pasi preparare pentru "+ this.nume);
        for(var pas: pasiPreparare){
            System.out.println(pas);
        }
    }
    @Override
    public String getDetalii() {
        return this.toString();
    }

    @Override
    public double getPret() {
        return this.pret;
    }

    @Override
    public void adaugaTopping() {
        System.out.println("Se adauga miere");
    }

    @Override
    public String toString() {
        return "Ceai{" +
                "nume='" + nume + '\'' +
                ", volum=" + volum +
                ", pret=" + pret +
                ", preparare='" + pasiPreparare + '\'' +
                '}';
    }

    @Override
    public BauturaPresetata copie() {
        Ceai copie = new Ceai();
        copie.nume=this.nume;
        copie.volum=this.volum;
        copie.pret=this.pret;
        copie.pasiPreparare=new ArrayList<>(this.pasiPreparare);
        return copie;
    }
}
