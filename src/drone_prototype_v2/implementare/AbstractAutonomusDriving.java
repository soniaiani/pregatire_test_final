package drone_prototype_v2.implementare;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractAutonomusDriving extends AutonomousDriving implements Cloneable{
    protected List<String> decisionRules;
    protected String version;

    public AbstractAutonomusDriving(String version) throws InterruptedException {
        super(version);
        this.decisionRules=new ArrayList<>();
        this.version=version;
    }


    public abstract void afisare();


    @Override
    public AbstractAutonomusDriving clone() {
        try {
            AbstractAutonomusDriving clone = (AbstractAutonomusDriving) super.clone();
            clone.version=version;
            clone.decisionRules=new ArrayList<>(decisionRules);
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public void addRule(String rule){
        decisionRules.add(rule);
    }
}
