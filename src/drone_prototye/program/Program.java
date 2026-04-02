package drone_prototye.program;

import drone_prototye.implementare.AutonomousDriving;
import drone_prototye.implementare.AutonomousDrivingLight;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) throws InterruptedException {
        AutonomousDrivingLight driving1 = new AutonomousDrivingLight("v1");
        AutonomousDriving driving2 = driving1.copie();
        driving1.afisare();
        driving2.afisare();
        List<String> reguli = new ArrayList<>();
        reguli.add("1");
        reguli.add("1");
        reguli.add("1");
        driving2.setDecisionRules(reguli);
        driving1.afisare();
        driving2.afisare();
        driving1.applyRule(1,"pula");
    }
}
