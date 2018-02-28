/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package ch.sbb.it42.rollenspiel;import ch.sbb.it42.rollenspiel.spielfiguren.C2_Elfe;
import ch.sbb.it42.rollenspiel.spielfiguren.C2_Goblin;
import ch.sbb.it42.rollenspiel.spielfiguren.C2_Mensch;
import ch.sbb.it42.rollenspiel.spielfiguren.C2_Ork;
import ch.sbb.it42.rollenspiel.spielfiguren.C2_Troll;
import ch.sbb.it42.rollenspiel.spielfiguren.C2_Zwerg;
import ch.sbb.it42.rollenspiel.waffen.C2_Keule;

import java.util.Scanner;

public class C0_StartRPG {
    private static String locVName = "";
    private static String locVRace;

    Double HP = C1_Spielfigur.getHP();



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Wähle deine Rasse: ");
        System.out.println("-1--Elfe");
        System.out.println("-2--Goblin");
        System.out.println("-3--Mensch");
        System.out.println("-4--Ork");
        System.out.println("-5--Troll");
        System.out.println("-6--Zwerg");

        int userRaceInput = scanner.nextInt();

        System.out.println("Wähle deinen Namen: ");

        String locVName = scanner.next();
        C1_Spielfigur.setName(locVName);

        switch (userRaceInput){
            case 1:
                C2_Elfe Elfe1 = new C2_Elfe();
                locVRace = "Elfe";
                break;
            case 2:
                C2_Goblin Goblin1 = new C2_Goblin();
                locVRace = "Goblin";
                break;
            case 3:
                C2_Mensch Mensch1 = new C2_Mensch();
                locVRace = "Mensch";
                break;
            case 4:
                C2_Ork Ork1 = new C2_Ork();
                locVRace = "Ork";
                break;
            case 5:
                C2_Troll Troll1 = new C2_Troll();
                locVRace = "Troll";
                break;
            case 6:
                C2_Zwerg Zwerg1 = new C2_Zwerg();
                locVRace = "Zwerg";
                break;
            default:
                System.out.println("Bitte gültige Eingaben machen");
        }
        C1_Spielfigur.setRace(locVRace);



        C1_Weapon Keule1 = new C1_Weapon();

        FigurStatusAusgabe();

    }

    public static void FigurStatusAusgabe(){
        System.out.println("---Status---");
        System.out.println("Name: " + C1_Spielfigur.getName());
        System.out.println("Rasse: " + C1_Spielfigur.getRace());
        System.out.println("HP: " + C1_Spielfigur.getHP());
        System.out.println("--");
        String asdf = String.valueOf(C1_Weapon.getDmg());
        System.out.println("Waffe: " + C1_Weapon.getType() + "(Schaden: " + asdf + ")");
    }
}
