package cafenea_prototype.implementare;

import java.util.List;

public abstract class AbstractBautura implements Bautura,BauturaPresetata{
    protected String nume;
    protected float volum;
    protected float pret;
    protected List<String> pasiPreparare;

    public AbstractBautura(String nume, float volum, float pret, List<String> pasiPreparare) {
        this.nume = nume;
        this.volum = volum;
        this.pret = pret;
        this.pasiPreparare = pasiPreparare;
    }

    AbstractBautura() {

    }

    public AbstractBautura setNume(String nume) {
        this.nume = nume;
        return this;
    }

    public AbstractBautura setVolum(float volum) {
        this.volum = volum;
        return this;
    }

    public AbstractBautura setPret(float pret) {
        this.pret = pret;
        return this;
    }

    public AbstractBautura setPasiPreparare(List<String> pasiPreparare) {
        this.pasiPreparare = pasiPreparare;
        return this;
    }
}
