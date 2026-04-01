package drone.implementare;

public class GPSSensor implements IDroneSensor{
    @Override
    public void start() {
        System.out.println("Pornire senzor GPS");
    }

    @Override
    public void stop() {
        System.out.println("Oprire senzor GPS");
    }

    @Override
    public String getSensorType() {
        return "GPSSensor";
    }
}
