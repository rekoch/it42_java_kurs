package makler;

public abstract class Wohnung {
    private String typ;
    private int wert;

    public abstract double berechneWert();

    public int getWert() {
        return wert;
    }

    public void setWert(int wert) {
        this.wert = wert;
    }
}
