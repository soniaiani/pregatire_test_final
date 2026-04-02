package aplicatie_membership;

public class Program {
    public static void main(String[] args) throws InterruptedException {
        AbonamentLunar a1 = AbonamentLunar.getInstance();
        AbonamentLunar a2 = AbonamentLunar.getInstance();

        Thread thread = new Thread(()->{
            AbonamentLunar a3 = AbonamentLunar.getInstance();
            System.out.println(a3);
        });

        thread.start();
        thread.join();

        System.out.println(a1);
        System.out.println(a2);

        Filtru f1 = Filtru.getBuilder().build();
        Filtru f2 = Filtru.getBuilder().setAnAparitie(2000).build();
        Filtru f3 = Filtru.getBuilder().setAnAparitie(2000).setCrescator(true).build();
        Filtru.FiltruBuilder builder = Filtru.getBuilder();
        builder.setCrescator(true).setTop10(true).setAnAparitie(2069);
        Filtru f4 = builder.build();
        System.out.println(f4);
        builder.setAnAparitie(2000);
        System.out.println(f4);

        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
    }
}
