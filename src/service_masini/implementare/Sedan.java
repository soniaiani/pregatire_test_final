package service_masini.implementare;

public class Sedan extends AMasina{
    public Sedan(String nume) {
        super(nume);
    }

    @Override
    public String toString() {
        return "Sedan{" +
                "nume='" + nume + '\'' +
                '}';
    }
}
