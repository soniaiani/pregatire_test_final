package service_masini.implementare;

public class Service implements IService{
    private String denumire;
    private AMasina masina;
    private volatile static Service instance;

    private Service() {

    }

    public static synchronized Service getInstance() {
        if(instance==null){
            instance=new Service();
        }
        return instance;
    }

    @Override
    public void acceptareMasina(AMasina masina){
        if(this.masina!=null){
            throw new RuntimeException("Masina deja in service");
        }
           this.masina=masina;
    }

    @Override
    public void finishMasina() {
        this.masina=null;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public String toString() {
        return "Service{" +
                "denumire='" + denumire + '\'' +
                ", masina=" + masina +
                '}';
    }
}
