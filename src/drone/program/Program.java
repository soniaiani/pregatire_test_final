package drone.program;

import drone.implementare.DroneConfiguration;
import drone.implementare.DroneSensorFactory;
import drone.implementare.IDroneSensor;
import drone.implementare.TipuriSenzori;

public class Program {
    public static void main(String[] args) {
        DroneConfiguration configurare1 = DroneConfiguration.getBuilder("rx1", 5000, "Canon").build();
        DroneConfiguration configurare3 = DroneConfiguration.getBuilder("rx1", 5000, "Canon").enableAutoPilot(true).enableNightVision(true).build();
        try {
            DroneConfiguration configurare2  = DroneConfiguration.getBuilder("rx1", 5000, "Canon").enableAutoPilot(true).
                    enableNightVision(true).setMaxAltitude(1000).setMaxSpeed(100).build();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(configurare1);
        System.out.println(configurare3);

        IDroneSensor sensor1 = DroneSensorFactory.getSensor(TipuriSenzori.OBSTACOL);
        System.out.println(sensor1.getSensorType());
        sensor1.start();
        sensor1.stop();

        IDroneSensor sensor2 = DroneSensorFactory.getSensor(TipuriSenzori.GPS);
        System.out.println(sensor2.getSensorType());
        sensor2.start();
        sensor2.stop();

        IDroneSensor sensor3 = DroneSensorFactory.getSensor(TipuriSenzori.THERMAL);
        System.out.println(sensor3.getSensorType());
        sensor3.start();
        sensor3.stop();

    }
}
