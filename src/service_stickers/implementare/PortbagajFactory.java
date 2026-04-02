package service_stickers.implementare;

public class PortbagajFactory implements IFabrica{
    @Override
    public IComponenta creareComponenta() {
        return new Portbagaj();
    }
}
