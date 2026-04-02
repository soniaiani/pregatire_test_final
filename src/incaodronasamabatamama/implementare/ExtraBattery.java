package incaodronasamabatamama.implementare;

public class ExtraBattery extends AbstractModule{
    private double capacitate;
    private boolean vitezaMare;

    public ExtraBattery() {
        this.capacitate=1000;
        this.vitezaMare=false;
        this.name="Baterie extra";
        this.description="descriere";
        this.price=500;
    }

    public void setCapacitate(double capacitate) {
        this.capacitate = capacitate;
    }

    public void setVitezaMare(boolean vitezaMare) {
        this.vitezaMare = vitezaMare;
    }

    public void setNume(String nume){
        this.name = nume;
    }

    public void setDescription(String description){
        this.description=description;
    }

    @Override
    public String toString() {
        return "ExtraBattery{" +
                "capacitate=" + capacitate +
                ", vitezaMare=" + vitezaMare +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
