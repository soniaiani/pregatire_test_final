package club_fotbal_prototype.implementare;

import java.util.List;

public abstract class AbstractSportiv implements IClonare {
    //set predefinit de antrenamente in functie de tipul de jucator(portarm atacant, mijlocas) sau de sport(fotbal, handbal,tenis)
    //lista de medicamente anti doping la care au acces toti jucatorii si e la fel pt toti
    //isi pot actualiza lista de antrenamentee in functie de evolutia sportiva
    protected CatalogMedicamente medicamenteInterzise;
    protected String nume;
    protected List<String> antrenamente;

    public AbstractSportiv(CatalogMedicamente medicamenteInterzise) {
        this.medicamenteInterzise = medicamenteInterzise;
    }

    public AbstractSportiv() {

    }

    public void setNume(String nume){
        this.nume=nume;
    }

    public void addAntrenament(String antrenament){
        antrenamente.add(antrenament);
    }

    public void addMedicament(String medicament){
        medicamenteInterzise.adaugaMedicament(medicament);
    }

    @Override
    public String toString() {
        return "AbstractSportiv{" +
                "medicamenteInterzise=" + medicamenteInterzise +
                ", nume='" + nume + '\'' +
                ", antrenamente=" + antrenamente +
                '}';
    }
}
