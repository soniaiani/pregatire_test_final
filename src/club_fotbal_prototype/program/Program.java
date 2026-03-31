package club_fotbal_prototype.program;

import club_fotbal_prototype.implementare.AbstractSportiv;
import club_fotbal_prototype.implementare.Atacant;
import club_fotbal_prototype.implementare.CatalogMedicamente;
import club_fotbal_prototype.implementare.Portar;

public class Program {
    public static void main(String[] args) {
        CatalogMedicamente medicamente = new CatalogMedicamente();
        medicamente.adaugaMedicament("cox");
        medicamente.adaugaMedicament("paracetamol");
        medicamente.adaugaMedicament("iarba");
        AbstractSportiv sportiv = new Atacant(medicamente);
        AbstractSportiv sportiv2 = new Portar(medicamente);
        System.out.println(sportiv);
        sportiv.setNume("Andrei Popa");
        sportiv.addAntrenament("Alergare cu spatele");
        sportiv.addMedicament("Parasinus");
        AbstractSportiv s2 = sportiv.copie();
        System.out.println(sportiv);
        System.out.println(s2);
        System.out.println(sportiv2);

    }
}
