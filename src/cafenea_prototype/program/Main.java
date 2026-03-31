package cafenea_prototype.program;

import cafenea_prototype.implementare.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> pasi_ceai_negru=new ArrayList<>();
        pasi_ceai_negru.add("Pas 1");
        pasi_ceai_negru.add("Pas 2");
        pasi_ceai_negru.add("Pas 3");
        //Bautura b1 = FactoryBautura.getBautura(TipBauturi.CEAI,"ceai",100,20,pasi_ceai_negru);
        AbstractBautura b1 = (AbstractBautura) FactoryBautura.getBautura(TipBauturi.CEAI,"ceai",100,20,pasi_ceai_negru);
        AbstractBautura b2 = (AbstractBautura) b1.copie();
        BauturaPresetata b3 = b1.copie();
        Bautura b4 = (Bautura) b1.copie();
        System.out.println(b1);
        System.out.println(b2);
        b1.setPret(69);
        System.out.println(b3);
        System.out.println(b4);
        //        Bautura b2 = FactoryBautura.getBautura(TipBauturi.CAFEA,"latte",150,20,"Se prepara latte");
//        System.out.println(b1.getDetalii());
//        System.out.println(b2.getDetalii());
//        b1.adaugaTopping();

    }
}