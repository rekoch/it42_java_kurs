/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

import Gegenstände.Heiltrank;
import Ruestung.LederRuestung;
import Spielfiguren.Mensch;
import Spielfiguren.Ork;
import Spielfiguren.Spielfigur;

public class Rollenspiel {
    private Spielfigur p1 = new Ork("Ork");
    private Spielfigur p2 = new Mensch("Mensch");
    private int runden = 0;

    public Rollenspiel(){
        p1.setLeben(2000);
        p2.setLeben(100);
        p2.nehmeGegenstandAuf(new Heiltrank(20));
        p2.nehmeGegenstandAuf(new Heiltrank(20));
        p2.nehmeGegenstandAuf(new Heiltrank(20));
        p2.nehmeGegenstandAuf(new Heiltrank(20));
        p2.zieheRuestungAn(new LederRuestung());
        kaempfe();
    }

    private void kaempfe(){
        while (p1.getLeben() >= 0 && p2.getLeben() >= 0){
            System.out.println("\n\n--------------------------------------------------------------------------------------");
            System.out.println("Runde " + runden);
            runden++;
            System.out.println("Leben von Spieler 1: " + p1.getLeben());
            System.out.println("Leben von Spieler 2: " + p2.getLeben());
            System.out.println("Spieler 2 greift an");
            if(p1.abwehr()){
                System.out.println("Abgewehrt");
            }else {
                p1.reduziereLeben(p2.getSpielerKampfwert());
            }
            System.out.println("Spieler 1 hat noch " + p1.getLeben() + " leben");
            System.out.println("Spieler 1 greift an");
            if(p2.abwehr()){
                System.out.println("Abgewehrt");
            } else {
                p2.reduziereLeben(p1.getSpielerKampfwert());
            }
            System.out.println("Spieler 2 hat noch " + p2.getLeben() + " leben");

            if (p1.heal()){
                System.out.println("\n******************************************\nSpieler 1 hat sich geheilt. Leben: " + p1.getLeben());
            }
            if (p2.heal()){
                System.out.println("\n******************************************\nSpieler 2 hat sich geheilt. Leben: " + p2.getLeben());
            }

        }
        if (p1.getLeben() <= 0){
            System.out.println("Spieler 1 hat verloren");
        }
        if (p2.getLeben() <= 0){
            System.out.println("Spieler 2 hat verloren");
        }
    }
}
