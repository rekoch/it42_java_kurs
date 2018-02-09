/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */


import java.util.Random;
import java.util.Scanner;

public class Spiel {
    public static void main(String[] args){

        int anzahlTipps = 0;
        Random rand = new Random();

        DotCom dotCom = new DotCom();

        int randomStartPos = (int) (Math.random() * 5);
        int[] orte = {randomStartPos, randomStartPos+1, randomStartPos+2};
        dotCom.setZellorte(orte);
        boolean lebt = true;

        while (lebt == true){
            String tipp = SpielHelfer.getBenutzereingabe("Geben sie eine Zahl ein");
            String resultat = dotCom.prüfDich(tipp);
            anzahlTipps++;
            if (resultat.equals("Versenkt")){
                lebt = false;
                System.out.println("Sie haben " + anzahlTipps + "Versuche benötigt");
            }
        }
    }
}
