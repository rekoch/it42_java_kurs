/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2017.
 */

package Lektion02;

import java.util.Scanner;

public class Aufgabe {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Bitte Namen eingeben:");
        String name = reader.next();

        System.out.println("Guten Tag " + name + " ,ich wünsche einen schönen Tag!");
        System.out.println("\nBitte Alter eingeben:");
        int alter = 0;

        while (!reader.hasNextInt()){
            reader.next();
            System.out.println("\nBitte Alter eingeben:");
        }
        alter = reader.nextInt();

        if (alter > 50){
            System.out.println("Sie haben wohl bereits viel Erfahrung im Leben!");
        }
        else if (alter > 100){
            System.out.println("Glückwunsch, nicht jeder erreicht das Alter von 100!");
        }
        else {
            System.out.println("Sie können noch viel Erfahrung sammeln!");
        }
    }
}
