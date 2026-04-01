package casa_marcat_singleton;

public interface AbstractCasaMarcat {
    void deschideComanda(AbstractAngajat angajat);
    void inchideComanda(AbstractAngajat angajat);
    void adaugaProdus(String denumireProdus);
    void showInfoComanda();
}
