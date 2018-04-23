package gluecksspiel;

public abstract class GluecksSpiel {
    double geld;

    public GluecksSpiel(double geld) {
        this.geld = geld;
    }

    public abstract double spiele();

    public double getGeld() {
        return geld;
    }
}
