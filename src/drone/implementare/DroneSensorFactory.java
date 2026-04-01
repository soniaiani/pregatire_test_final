package drone.implementare;

public class DroneSensorFactory {
    public static IDroneSensor getSensor(TipuriSenzori tip){
        switch (tip){
            case OBSTACOL -> {
                return new ObstacolSensor();
            }
            case GPS -> {
                return new GPSSensor();
            }
            case THERMAL -> {
                return new ThermalSensor();
            }
            default -> {
                return null;
            }
        }
    }

}
