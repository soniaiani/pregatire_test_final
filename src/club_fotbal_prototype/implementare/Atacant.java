package club_fotbal_prototype.implementare;

import java.util.ArrayList;

public class Atacant extends AbstractSportiv{

    public Atacant(CatalogMedicamente medicamenteInterzise) {
        super(medicamenteInterzise);
        this.antrenamente=new ArrayList<>();
        antrenamente.add("Sprint");
        antrenamente.add("Driblaj");
    }

    public Atacant() {

    }

    @Override
    public AbstractSportiv copie() {
        Atacant copie = new Atacant();
        copie.medicamenteInterzise=this.medicamenteInterzise;
        copie.antrenamente=new ArrayList<>(this.antrenamente);
        return copie;
    }
}
