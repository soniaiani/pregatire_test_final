package service_stickers.implementare;

public class Masina implements IMasina {

    private ModelMasina model;
    private int anFabricatie;

    public Masina(ModelMasina model, int anFabricatie) {
        this.model = model;
        this.anFabricatie = anFabricatie;
    }

    @Override
    public ModelMasina getModel() {
        return model;
    }

    @Override
    public int getAn() {
        return anFabricatie;
    }
}
