package drone_prototype_v2.implementare;

import drone_prototye.implementare.AutonomousDriving;

public class AutonomousDrivingV1 extends AbstractAutonomusDriving{

    public AutonomousDrivingV1(String version) throws InterruptedException {
        super(version);
        decisionRules.add("rv1");
        decisionRules.add("rv2");
        decisionRules.add("rv3");
    }


    @Override
    public void afisare() {
        System.out.println(version + "decision rules: "+ decisionRules);
    }

    @Override
    public void applyRule(int index, String context) {
        if(index>=0 && index<decisionRules.size()){
            System.out.println(decisionRules.get(index)+" Context: "+context);
        }
    }

}
