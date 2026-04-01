package drone.implementare;

public class DroneConfiguration {
    private String model;
    private double capacitateBaterie;
    private String tipCamera;
    private boolean pilotAutomat;
    private boolean nightVision;
    private int altitudineMaxima;
    private float vitezaMaxima;

    DroneConfiguration(AbstractDroneBuilder builder) {
        this.model= builder.model;
        this.capacitateBaterie= builder.capacitateBaterie;
        this.tipCamera= builder.tipCamera;
        this.nightVision= builder.nightVision;
        this.pilotAutomat= builder.pilotAutomat;
        this.altitudineMaxima= builder.altitudineMaxima;
        this.vitezaMaxima= builder.vitezaMaxima;
    }

    @Override
    public String toString() {
        return "DroneConfiguration{" +
                "model='" + model + '\'' +
                ", capacitateBaterie=" + capacitateBaterie +
                ", tipCamera='" + tipCamera + '\'' +
                ", pilotAutomat=" + pilotAutomat +
                ", nightVision=" + nightVision +
                ", altitudineMaxima=" + altitudineMaxima +
                ", vitezaMaxima=" + vitezaMaxima +
                '}';
    }

    public static DroneBuilder getBuilder(String model, double capacitateBaterie, String tipCamera){
        return new DroneBuilder(model,capacitateBaterie,tipCamera);
    }
}
