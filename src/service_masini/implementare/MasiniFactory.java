package service_masini.implementare;

public class MasiniFactory {
    public static AMasina createMasina(TipuriMasini tip, String nume){
        switch (tip){
            case SUV -> {
                return new SUV(nume);
            }
            case SEDAN -> {
                return new Sedan(nume);
            }
            default -> {
                return null;
            }
        }
    }
}
