package drone_singleton.implementare.Module;

public class FactoryModule {
    public static AbstractModule getModule(TipuriModule tip, String name, String description, float price){
        switch (tip){
            case VEDERE_NOAPTE -> {
                return new VedereNoapte(name,description,price,0,0);
            }
            case GPS -> {
                return new GPSTracking(name,description,price,false,"-");

            }
            case URMARIRE_INTELIGENTA -> {
                return new UrmarireInteligenta(name,description,price,false,0);
            }
            default -> {
                return null;
            }
        }
    }

}
