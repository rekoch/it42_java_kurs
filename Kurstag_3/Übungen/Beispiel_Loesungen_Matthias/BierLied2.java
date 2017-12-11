/**
 * Einfachere Loesung, allerdings nicht dieselbe Ausgabe wie Original:
 * "99 Flaschen Bier" wird im Original nur einmal ausgegeben, hier zweimal.
 */
public class BierLied2 {
    public static void main(String[] args) {
        int bierAnzahl = 99;
        while (bierAnzahl > 0) {
            String wort = "Flaschen";
            if (bierAnzahl == 1) {
                wort = "Flasche";
            }
            System.out.println(bierAnzahl + " " + wort + " Bier im Kühlschrank");
            System.out.println(bierAnzahl + " " + wort + " Bier im Kühlschrank");
            System.out.println(bierAnzahl + " " + wort + " Bier.");
            System.out.println("Nimm eins raus.");
            System.out.println("Reich es herum.");
            bierAnzahl = bierAnzahl - 1;
        }
        System.out.println("Kein Bier mehr im Kühlschrank");
    }
}

