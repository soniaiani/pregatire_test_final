package service_stickers.implementare;

public class UsaFactory implements IFabrica{
    @Override
    public IComponenta creareComponenta() {
        return new Usa();
    }
}
