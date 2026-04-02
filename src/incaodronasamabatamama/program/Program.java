package incaodronasamabatamama.program;

import incaodronasamabatamama.implementare.*;

public class Program {
    public static void main(String[] args) {
        Drona d1 = Drona.getBuilder("model 1","v1").build();
        System.out.println(d1);

        IFactory f1 = new BatteryFactory();
        AbstractModule modul = f1.createModul();
        ((ExtraBattery) modul).setDescription("Pula");
        Drona d2 = Drona.getBuilder("model 2","v2").setPro(true).setVitezaMaxima(500).setModulExra(modul).build();

        System.out.println(d2);
    }
}
