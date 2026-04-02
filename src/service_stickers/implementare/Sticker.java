package service_stickers.implementare;

public class Sticker implements Cloneable{
    private String dimensiuni;
    private String culoare;
    private boolean efectHolo;

    public Sticker(IMasina masina) {
        this.dimensiuni = CalculatorDimensiuni.calculator(masina.getModel(), masina.getAn());
        this.culoare="alb";
        this.efectHolo=false;
        System.out.println("Apelare constructor consumator");
    }

    public void setEfectHolo(boolean efectHolo) {
        this.efectHolo = efectHolo;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    @Override
    public Sticker clone() {
        try {
            Sticker clone = (Sticker) super.clone();
            clone.dimensiuni=this.dimensiuni;
            clone.culoare=this.culoare;
            clone.efectHolo=this.efectHolo;
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "Sticker{" +
                "dimensiuni='" + dimensiuni + '\'' +
                ", culoare='" + culoare + '\'' +
                ", efectHolo=" + efectHolo +
                '}';
    }
}
