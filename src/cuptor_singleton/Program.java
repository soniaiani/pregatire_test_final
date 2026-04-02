package cuptor_singleton;

public class Program {


    public static void main(String[] args) {
        Cuptor cuptor = Cuptor.getInstance();
        Cuptor cuptor2 = Cuptor.getInstance();
        cuptor.addPreparat(new Preparat("pizza",30,160));
        cuptor.addPreparat(new Preparat("legume",60,220));
        cuptor2.addPreparat(new Preparat("pizza",30,160));
        System.out.println(cuptor);

        //pot face si clasa comanda cu o lista de preparate, dar nu am chef
    }
}
