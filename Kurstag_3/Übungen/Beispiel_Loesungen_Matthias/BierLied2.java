public class BierLied2 {
    public static void main(String[] args) {
        int bierAnzahl = 99;
        String wort = "Flaschen";
        while (bierAnzahl > 0) {
            if (bierAnzahl == 1) {
                wort = "Flasche";
            }
            System.out.println(bierAnzahl + " " + wort + " Bier im Kühlschrank");
            System.out.println(bierAnzahl + " " + wort + " Bier im Kühlschrank");
            System.out.println("Nimm eins raus.");
            System.out.println("Reich es herum.");
            bierAnzahl = bierAnzahl - 1;
        }
        System.out.println("Kein Bier mehr im Kühlschrank");
    }
}

