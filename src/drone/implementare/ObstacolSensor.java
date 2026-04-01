package drone.implementare;

public class ObstacolSensor implements IDroneSensor{

    @Override
    public void start() {
        System.out.println("Pornire senzor obstacole");
    }

    @Override
    public void stop() {
        System.out.println("Oprire senzor obstacole");
    }

    @Override
    public String getSensorType() {
        return "ObstacolSensor";
    }
}
