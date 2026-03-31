package club_fotbal_prototype.implementare;

import java.util.ArrayList;
import java.util.List;

public class Portar extends AbstractSportiv{

    public Portar(CatalogMedicamente medicamenteInterzise) {
        super(medicamenteInterzise);
        this.antrenamente=new ArrayList<>();
        antrenamente.add("Fandari");
        antrenamente.add("Reflexe");
    }

    public Portar() {
        super();
    }

    @Override
    public AbstractSportiv copie() {
        Portar copie = new Portar();
        copie.medicamenteInterzise=this.medicamenteInterzise;
        copie.antrenamente=new ArrayList<>(this.antrenamente);
        return copie;
    }
}
