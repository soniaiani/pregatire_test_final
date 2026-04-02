package drone_singleton.program;

import drone_singleton.implementare.Conexiune.DroneConnection;
import drone_singleton.implementare.Module.*;

public class Program {

    public static void main(String[] args) {
        DroneConnection connection1 = DroneConnection.getInstance();
        DroneConnection connection2 = DroneConnection.getInstance();
        //DroneConnection connection3 = DroneConnection.getInstance();

        //System.out.println(connection1==connection2);
        connection1.connect("Sonia");
        try {
            connection2.connect("Andrei Popa");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            connection1.viewConnections();
        }
        connection1.disconnect("Sonia");
        try {
            connection2.connect("Jhon Pork");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            connection1.viewConnections();
        }
        connection1.viewConnections();
        connection1.isConnected("Sonia");
        System.out.println(connection1.isConnected("Sonia"));

        //-------------------------------------
        AbstractModule m1 = FactoryModule.getModule(TipuriModule.GPS,"gps","gpsul pulii",1000);
        ((GPSTracking) m1).setAccurateMarita(true).setTipHarta("Mare");
        System.out.println(m1);
        AbstractModule m2 = FactoryModule.getModule(TipuriModule.URMARIRE_INTELIGENTA,"urmarire","descriere",89);


    }
}
