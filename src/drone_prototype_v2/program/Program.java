package drone_prototype_v2.program;

import drone_prototype_v2.implementare.ADFactory;
import drone_prototype_v2.implementare.AbstractAutonomusDriving;
import drone_prototype_v2.implementare.AutonomousDrivingV1;
import drone_prototype_v2.implementare.TipAD;

public class Program {

        public static void main(String[] args) throws InterruptedException {

            AbstractAutonomusDriving dr1 = ADFactory.getAD(TipAD.V1,"version 69");
            dr1.afisare();
            AbstractAutonomusDriving dr2 = dr1.clone();
            dr2.afisare();
            dr1.addRule("p1");
            dr1.afisare();
            dr2.afisare();


    }

}
