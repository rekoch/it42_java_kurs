//NICHT FERTIG
public class Doppelzimmer extends Zimmer
{
    private int anzahl = 8;
    private int freiePlaetze = 2;
    private double preis = 20;
    private Gast gast1;
    private Gast gast2;

    public Doppelzimmer(Gast gast1, Gast gast2)
    {
        this.gast1 = gast1;
        this.gast2 = gast2;
    }
}
