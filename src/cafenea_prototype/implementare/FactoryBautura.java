package cafenea_prototype.implementare;

import java.util.List;

public class FactoryBautura {
    public static Bautura getBautura(TipBauturi tip, String nume, float volum, float pret, List<String> pasiPreparare){
        switch (tip){
            case CAFEA -> {
                return new Cafea(nume, volum, pret, pasiPreparare);
            }
            case CEAI -> {
                return new Ceai(nume, volum, pret, pasiPreparare);
            }
            default -> {
                return null;
            }
        }
    }
}
