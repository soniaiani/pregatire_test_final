package drone_prototype_v2.implementare;

public class AutonomousDrivingV2 extends AbstractAutonomusDriving{
    public AutonomousDrivingV2(String version) throws InterruptedException {
        super(version);
        decisionRules.add("rv21");
        decisionRules.add("rv22");
        decisionRules.add("rv23");
    }


    @Override
    public void afisare() {
        System.out.println("v2: " + "decision rules: "+ decisionRules);
    }

    @Override
    public void applyRule(int index, String context) {
        if(index>=0 && index<decisionRules.size()){
            System.out.println(decisionRules.get(index)+" Context: "+context);
        }
    }
}
