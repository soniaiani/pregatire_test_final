package drone.implementare;

public class DroneBuilder extends AbstractDroneBuilder{
    public DroneBuilder(String model, double capacitateBaterie, String tipCamera) {
        super(model, capacitateBaterie, tipCamera);
    }

    @Override
    public AbstractDroneBuilder enableAutoPilot(boolean value) {
        if(value&&!this.pilotAutomat){
            verificaOptiuni();
        }
        this.pilotAutomat=value;
        return this;
    }

    @Override
    public AbstractDroneBuilder enableNightVision(boolean value) {
        if(value&&!this.nightVision){
            verificaOptiuni();
        }
        this.nightVision=value;
        return this;
    }

    @Override
    public AbstractDroneBuilder setMaxAltitude(int maxAltitude) {
        if(altitudineMaxima==0){
            verificaOptiuni();
        }
        this.altitudineMaxima=maxAltitude;
        return this;
    }

    @Override
    public AbstractDroneBuilder setMaxSpeed(float maxSpeed) {
        if(vitezaMaxima==0){
            verificaOptiuni();
        }
        this.vitezaMaxima=maxSpeed;
        return this;
    }

    @Override
    public DroneConfiguration build() {
        if(altitudineMaxima<0 || altitudineMaxima>10000){
            throw new RuntimeException("altitudine maxima nepermisa");
        }
        if(vitezaMaxima<0 || vitezaMaxima>10000){
            throw new RuntimeException("viteza maxima nepermisa");
        }
        return new DroneConfiguration(this);
    }
}
