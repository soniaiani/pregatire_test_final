package drone_prototye.implementare;

import java.util.ArrayList;

public class AutonomousDrivingLight extends AutonomousDriving {
    public AutonomousDrivingLight(String version) throws InterruptedException {
        super(version);
        getDecisionRules().add("Regula 1");
        getDecisionRules().add("Regula 2");
        getDecisionRules().add("Regula 3");
    }

    @Override
    public void applyRule(int index, String context) {
        if(index>0 || index<getDecisionRules().size()){
            System.out.println(getDecisionRules().get(index) + "Context: "+ context);
        }
    }

    public AutonomousDrivingLight(){
        super();
    }

    @Override
    public void afisare() {
        System.out.println(getVersion()+" "+getDecisionRules());
    }

    @Override
    public AutonomousDriving copie() {
        AutonomousDrivingLight copie = new AutonomousDrivingLight();
        copie.setDecisionRules(new ArrayList<>(getDecisionRules()));
        copie.setVersion(getVersion());
        return copie;
    }


}
