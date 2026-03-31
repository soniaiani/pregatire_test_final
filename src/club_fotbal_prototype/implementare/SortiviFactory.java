package club_fotbal_prototype.implementare;

public class SortiviFactory {
    public static AbstractSportiv getSportiv(TipSportiv sportiv, CatalogMedicamente medicamente){
        return switch (sportiv) {
            case PORTAT -> new Portar(medicamente);
            case ATACANT -> new Atacant(medicamente);
            default -> null;
        };
    }
}
