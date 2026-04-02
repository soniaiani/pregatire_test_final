package service_stickers.program;

import service_stickers.implementare.*;

public class Program {
    public static void main(String[] args) {
        Masina m1 = new Masina(ModelMasina.SUV,2015);
        Masina m2 = new Masina(ModelMasina.SUV,2015);

        Sticker s1 = FactorySticker.getSticker(m1);
        Sticker s2 = FactorySticker.getSticker(m2);
        s1.setCuloare("cacaniu");

        System.out.println(s1);
        System.out.println(s2);

        IFabrica fabricaUsi = new UsaFactory();
        IFabrica fabricaPortbagaj = new PortbagajFactory();

        IComponenta componenta1 = fabricaUsi.creareComponenta();
        componenta1.afisareDetalii();
        IComponenta componenta2 = fabricaPortbagaj.creareComponenta();
        componenta2.afisareDetalii();

    }
}
