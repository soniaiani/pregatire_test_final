package club_fotbal_prototype.implementare;

import java.util.ArrayList;
import java.util.List;

public class CatalogMedicamente {
    private List<String> medicamente;

    public CatalogMedicamente() {
        this.medicamente = new ArrayList<>();
    }

    public void adaugaMedicament(String medicament){
        if(!medicamente.contains(medicament)){
            medicamente.add(medicament);
        }
    }

    @Override
    public String toString() {
        return "CatalogMedicamente{" +
                "medicamente=" + medicamente +
                '}';
    }
}
