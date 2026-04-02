package cuptor_singleton;

public class Preparat {
    private String denumire;
    private int timpGatire;
    private int grade;

    public Preparat(String denumire, int timpGatire, int grade) {
        this.denumire = denumire;
        this.timpGatire = timpGatire;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Preparat{" +
                "denumire='" + denumire + '\'' +
                ", timpGatire=" + timpGatire +
                ", grade=" + grade +
                '}';
    }
}
