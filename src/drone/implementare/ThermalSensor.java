package drone.implementare;

public class ThermalSensor implements IDroneSensor{
    @Override
    public void start() {
        System.out.println("Pornire senzor termic");
    }

    @Override
    public void stop() {
        System.out.println("Oprire senzor termic");
    }

    @Override
    public String getSensorType() {
        return "ThermalSensor";
    }
}
