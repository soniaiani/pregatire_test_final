package service_masini.program;

import service_masini.implementare.*;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Program {


    public static void main(String[] args) {
        Service service = Service.getInstance();
        AMasina masina = new SUV("suv sonia");
        //service.acceptareMasina(masina);
        System.out.println(service);
        Service service1 = Service.getInstance();
        System.out.println(service1);

        AMasina masina1 = MasiniFactory.createMasina(TipuriMasini.SEDAN,"sedan tip 1");
        AMasina masina2 = MasiniFactory.createMasina(TipuriMasini.SEDAN,"sedan tip 2");
        AMasina masina3 = MasiniFactory.createMasina(TipuriMasini.SUV,"suv tip 1");
        AMasina masina4 = MasiniFactory.createMasina(TipuriMasini.SUV,"suv tip 2");

        System.out.println(masina1);
        System.out.println(masina2);
        System.out.println(masina3);
        System.out.println(masina4);


//        int noThreads = 5;
//        ExecutorService executor = Executors.newFixedThreadPool(noThreads);
//
//      for(int i=0;i<noThreads;i++){
//            executor.execute(()->{
//                Service instance = Service.getInstance();
//                try {
//                    instance.acceptareMasina(masina);
//                } catch (Exception e) {
//                    System.out.println(e.getMessage()+" "+Thread.currentThread());
//
//                }
//                System.out.println("Thread: " + Thread.currentThread().getName()+ "+ instance: " + instance);
//            });
//        }


    }
}
