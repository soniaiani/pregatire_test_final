package incaodronasamabatamama.implementare;

public class BatteryFactory implements IFactory{
    @Override
    public AbstractModule createModul() {
        return new ExtraBattery();
    }
}
