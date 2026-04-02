package service_stickers.implementare;

public class CalculatorDimensiuni {

    public static String calculator(ModelMasina model, int anFabricatie){
        switch (model){
            case SEDAN -> {
                if(anFabricatie<2010) {
                    return "2000x4000";
                } else return "2500x4500";
            }
            case SUV -> {
                if(anFabricatie<2010) {
                    return "1000x4000";
                } else return "2500x7500";
            }
            case MICA -> {
                if(anFabricatie<2010) {
                    return "1000x2000";
                } else return "2500x1500";
            }
            default -> {
                return null;
            }

        }
    }
}
