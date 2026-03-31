package mall_builder.proram;

import mall_builder.implementare.Magazin;
import mall_builder.implementare.TipuriDecoratiuni;

public class Program {
    public static void main(String[] args) {
        Magazin magazin = Magazin.getBuilder("Zara",100,2).setPodeaPersonalizataSiDuritate(true,1).build();
        Magazin.MagazinBuilder builder = Magazin.getBuilder("Auchan",200,2);
        builder.setPodeaPersonalizataSiDuritate(true,1);
        //Magazin m1= builder.build();
        builder.addDecoratiune(TipuriDecoratiuni.STICLA).addDecoratiune(TipuriDecoratiuni.LEMN);
        Magazin m2= builder.build();
        //System.out.println(m1);
        System.out.println(m2);

    }
}
