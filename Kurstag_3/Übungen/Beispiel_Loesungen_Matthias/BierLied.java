public class BierLied {
    public static void main(String[] args) {
        int bierAnzahl = 99;
        String wort = "Flaschen";
        while (bierAnzahl > 0) { // hier muss man NICHT >= schreiben, weil Spezialfall bierAnzahl==0 schon unten
                                 // mit "Kein Bier im K�hlschrank" abgehandelt wird.
            System.out.println(bierAnzahl + " " + wort + " Bier im K�hlschrank");
            System.out.println(bierAnzahl + " " + wort + " Bier.");
            System.out.println("Nimm eins raus.");
            System.out.println("Reich es herum.");
            bierAnzahl = bierAnzahl - 1;
            if (bierAnzahl == 1) { // Bedingung hierher verschoben, damit schon bei der naechsten
                wort = "Flasche";  // Ausgabe (Zeile 16) 'Flasche' verwendet wird, wenn bierAnzahl 1 ist.
            }
            if (bierAnzahl > 0) {
                System.out.println(bierAnzahl + " " + wort + " Bier im K�hlschrank");
            } else {
                System.out.println("Kein Bier mehr im K�hlschrank");
            }
        }
    }
}


