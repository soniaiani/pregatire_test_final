package drone.implementare;

public abstract class AbstractDroneBuilder implements AbstractDroneCreation{

    protected String model;
    protected double capacitateBaterie;
    protected String tipCamera;
    protected boolean pilotAutomat;
    protected boolean nightVision;
    protected int altitudineMaxima;
    protected float vitezaMaxima;

    protected int optiuniActive=0;

    public AbstractDroneBuilder(String model, double capacitateBaterie, String tipCamera) {
        this.model = model;
        this.capacitateBaterie = capacitateBaterie;
        this.tipCamera = tipCamera;
    }

    protected void verificaOptiuni(){
            if(optiuniActive>=2){
                throw new RuntimeException("Ai depasit limita de 2 optiuni atcivate");
            }
            optiuniActive++;
    }
}
