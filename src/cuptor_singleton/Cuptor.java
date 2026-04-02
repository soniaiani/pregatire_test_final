package cuptor_singleton;

import java.util.ArrayList;
import java.util.List;

public class Cuptor {
    private static Cuptor instance = new Cuptor();
    private List<Preparat> listaAsteptare;

    private Cuptor(){
        this.listaAsteptare=new ArrayList<>();
    }

    public static Cuptor getInstance() {
        return instance;
    }

    public void addPreparat(Preparat p){
        listaAsteptare.add(p);
    }

    @Override
    public String toString() {
        return "Cuptor{" +
                "listaAsteptare=" + listaAsteptare +
                '}';
    }
}
