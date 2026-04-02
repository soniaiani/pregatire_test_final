package service_masini.implementare;

public class SUV extends AMasina{

    public SUV(String nume) {
        super(nume);
    }

    @Override
    public String toString() {
        return "SUV{" +
                "nume='" + nume + '\'' +
                '}';
    }
}
