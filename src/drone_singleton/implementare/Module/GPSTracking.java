package drone_singleton.implementare.Module;

public class GPSTracking extends AbstractModule {

    private boolean accurateMarita;
    private String tipHarta;

    public GPSTracking(String name, String description, float price,boolean accurateMarita, String tipHarta) {
        super(name, description, price);
        this.accurateMarita=accurateMarita;
        this.tipHarta=tipHarta;
    }

    public GPSTracking setAccurateMarita(boolean accurateMarita) {
        this.accurateMarita = accurateMarita;
        return this;
    }

    public GPSTracking setTipHarta(String tipHarta) {
        this.tipHarta = tipHarta;
        return this;
    }

    @Override
    public String toString() {
        return "GPSTracking{" +
                "accurateMarita=" + accurateMarita +
                ", tipHarta='" + tipHarta + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
