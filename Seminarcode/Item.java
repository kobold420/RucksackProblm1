package Seminarcode;

public class Item {
    private final double Wert;
    private final double Gewicht;

    private double Qou;

    public Item(double Wert, double Gewicht) {
        this.Wert = Wert;
        this.Gewicht = Gewicht;
    }

    public double getWert() {
        return Wert;
    }

    public double getGewicht() {
        return Gewicht;
    }

    public double getQou() {
        if (Gewicht != 0) {
            Qou = Wert / Gewicht;
        }
        return Qou;
    }
}