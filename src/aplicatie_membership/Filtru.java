package aplicatie_membership;

public class Filtru {

    private boolean top10;
    private boolean crescator;
    private int anAparitie;

    private Filtru() {
    }

    public static FiltruBuilder getBuilder(){
        return new FiltruBuilder();
    }

    @Override
    public String toString() {
        return "Filtru{" +
                "top10=" + top10 +
                ", crescator=" + crescator +
                ", anAparitie=" + anAparitie +
                '}';
    }

    public static class FiltruBuilder implements AbstractSearchingFilter{

        private boolean top10;
        private boolean crescator;
        private int anAparitie;

        FiltruBuilder(){

        }

        public FiltruBuilder setTop10(boolean top10) {
            this.top10 = top10;
            return this;
        }

        public FiltruBuilder setCrescator(boolean crescator) {
            this.crescator = crescator;
            return this;
        }

        public FiltruBuilder setAnAparitie(int anAparitie) {
            this.anAparitie = anAparitie;
            return this;
        }

        @Override
        public Filtru build() {
            Filtru f = new Filtru();
            f.anAparitie=this.anAparitie;
            f.top10=this.top10;
            f.crescator=this.crescator;
            return f;
        }
    }
}
