package drone_prototye.implementare;

import java.util.ArrayList;
import java.util.List;

public abstract class AutonomousDriving implements IClone{
    private String version;
    private List<String> decisionRules;
    public AutonomousDriving(String version) throws InterruptedException {
        this.version = version;
        System.out.println("Start AI module .... ");
        Thread.sleep(0);
        System.out.println("Init AI module .... learning done");
    }

    public AutonomousDriving() {

    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public List<String> getDecisionRules() {
        if(decisionRules==null){
            decisionRules= new ArrayList<>();
        }
        return decisionRules;
    }



    public void setDecisionRules(List<String> decisionRules) {
        this.decisionRules = decisionRules;
    }

    abstract void applyRule(int index, String context);



}
