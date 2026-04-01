package drone_singleton.implementare.Module;

public class VedereNoapte extends AbstractModule {

    private int rezolutie;
    private double durata;

    public VedereNoapte(String name, String description, float price,int rezolutie, double durata) {
        super(name, description, price);
        this.rezolutie=rezolutie;
        this.durata=durata;
    }

    @Override
    public String toString() {
        return "VedereNoapte{" +
                "rezolutie=" + rezolutie +
                ", durata=" + durata +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }

    public VedereNoapte setDurata(double durata) {
        this.durata = durata;
        return this;
    }

    public VedereNoapte setRezolutie(int rezolutie) {
        this.rezolutie = rezolutie;
        return this;
    }
}
