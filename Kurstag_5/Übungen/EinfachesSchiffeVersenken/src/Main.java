import java.lang.Math;

public class Main
{
    public static void main (String[]args)
    {
        int zufallsOrt = (int) (Math.random() * 5);
        int anzahlVersuche = 0;
        int[]orte = {zufallsOrt, zufallsOrt + 1, zufallsOrt + 2};
        boolean lebt = true;
        String tipp;
        String ergebnis;
        EinfachesDotCom haustiere = new EinfachesDotCom();
        SpielHelfer helfer = new SpielHelfer();

        haustiere.setZellorte(orte);

        while(lebt)
        {
            tipp = helfer.getBenutzereingabe("Geben sie eine Zahl ein: ");
            ergebnis = haustiere.prüfDich(tipp);
            anzahlVersuche++;

            if (ergebnis.equals("Versenkt"))
            {
                lebt = false;
                System.out.println("Sie haben gewonnen! Anzahl Versuche: " + anzahlVersuche);
            }
        }

    }
}
