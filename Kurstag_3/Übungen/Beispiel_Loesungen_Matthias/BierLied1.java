public class BierLied1 {
    public static void main(String[] args) {
        int bierAnzahl = 99;
        String wort = "Flaschen";
        while (bierAnzahl > 0) {
            System.out.println(bierAnzahl + " " + wort + " Bier im Kühlschrank");
            System.out.println(bierAnzahl + " " + wort + " Bier.");
            System.out.println("Nimm eins raus.");
            System.out.println("Reich es herum.");
            bierAnzahl = bierAnzahl - 1;
            if (bierAnzahl == 1) {// if-Bedingung hierher verschoben.
                wort = "Flasche"; // Singular, wie in EINE Flasche.
            }
            if (bierAnzahl > 0) {
                System.out.println(bierAnzahl + " " + wort + " Bier im Kühlschrank");
            } else {
                System.out.println("Kein Bier mehr im Kühlschrank");
            }
        }
    }
}

