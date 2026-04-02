package aplicatie_membership;

public class AbonamentLunar extends AbstractMembership{
    private static volatile AbonamentLunar instance;
    private AbonamentLunar(){

    }

    public static synchronized AbonamentLunar getInstance(){
        if(instance==null){
            instance =  new AbonamentLunar();
        }
        return instance;
    }

}
