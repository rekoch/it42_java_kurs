/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2017.
 */

public class BierLied {
    public static void main (String[] args){
        int bierAnzahl = 99;
        String wort = "Flaschen";

        while (bierAnzahl  > 0){

            if (bierAnzahl == 1){
                wort = "Flasche";
            }

            System.out.println(bierAnzahl + " " + wort + " Bier im Kuehlschrank"); //ü kann nicht angezeigt werden
            System.out.println(bierAnzahl + " " + wort + " Bier.");
            System.out.println(bierAnzahl + " " + wort + " Hol eine raus.");
            System.out.println(bierAnzahl + " " + wort + " Und lass sie rumgehen.");
            bierAnzahl = bierAnzahl - 1;
        }

        if (bierAnzahl > 0){
            System.out.println(bierAnzahl + " " + wort + " Bier im Kuehlschrank"); //ü kann nicht angezeigt werden
        }
        else {
            System.out.println("Kein Bier mehr im Kuehlschrank"); //ü kann nicht angezeigt werden
        }
    }
}
