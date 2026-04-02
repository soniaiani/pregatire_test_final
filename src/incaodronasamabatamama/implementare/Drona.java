package incaodronasamabatamama.implementare;

public class Drona {

    private String model;
    private String versiune;
    private boolean pro;
    private float vitezaMaxima;
    private AbstractModule modulExra;

    private Drona(String model, String versiune,boolean pro,float vitezaMaxima,AbstractModule modul) {
        this.model = model;
        this.versiune = versiune;
        this.pro=pro;
        this.vitezaMaxima=vitezaMaxima;
        this.modulExra=modul;
    }

    public static DronaBuilder getBuilder(String model, String versiune){
        return new DronaBuilder(model,versiune);
    }

    @Override
    public String toString() {
        return "Drona{" +
                "model='" + model + '\'' +
                ", versiune='" + versiune + '\'' +
                ", pro=" + pro +
                ", vitezaMaxima=" + vitezaMaxima +
                ",modul=" + modulExra +
                '}';
    }

    public static class DronaBuilder implements IBuilder {

        private String model;
        private String versiune;
        private boolean pro;
        private float vitezaMaxima;
        private AbstractModule modulExra;


        private DronaBuilder(String model, String versiune) {
            this.model = model;
            this.versiune = versiune;
        }

        public DronaBuilder setPro(boolean pro) {
            this.pro = pro;
            return this;
        }

        public DronaBuilder setVitezaMaxima(float vitezaMaxima) {
            this.vitezaMaxima = vitezaMaxima;
            return this;
        }

        public DronaBuilder setModulExra(AbstractModule modulExra) {
            this.modulExra = modulExra;
            return this;
        }

        @Override
        public Drona build() {
            if(this.vitezaMaxima>1000){
                throw new RuntimeException("Viteza maxima prea mare");
            }
            Drona rezultat = new Drona(model,versiune,pro,vitezaMaxima,modulExra);
            this.vitezaMaxima=0;
            this.pro=false;
            this.modulExra=null;
            return rezultat;
        }


    }
}
