package drone_prototype_v2.implementare;

public class ADFactory {
    public static AbstractAutonomusDriving getAD(TipAD tip,String version){
        switch (tip){
            case V1 -> {
                try {
                    return new AutonomousDrivingV1(version);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            case V2 -> {
                try {
                    return new AutonomousDrivingV2(version);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            default -> {
                return null;
            }
        }
    }
}
