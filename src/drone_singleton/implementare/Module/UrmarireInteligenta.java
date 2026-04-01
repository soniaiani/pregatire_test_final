package drone_singleton.implementare.Module;

public class UrmarireInteligenta extends AbstractModule {

    private boolean pro;
    private double distanta;

    public UrmarireInteligenta(String name, String description, float price,boolean pro,double distanta) {
        super(name, description, price);
        this.pro=pro;
        this.distanta=distanta;
    }

    @Override
    public String toString() {
        return "UrmarireInteligenta{" +
                "pro=" + pro +
                ", distanta=" + distanta +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }

    public UrmarireInteligenta setPro(boolean pro) {
        this.pro = pro;
        return this;
    }

    public UrmarireInteligenta setDistanta(double distanta) {
        this.distanta = distanta;
        return this;
    }
}
