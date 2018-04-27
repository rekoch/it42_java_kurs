/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package ch.sbb.it42javakurs.musterloesung.kurstag03;

public class MischMasch1 {

    public static void main(String[] args) {
        int x = 3;


        while (x > 0) {

            if (x > 2) {
                System.out.print("a");
            }

            x = x - 1;
            System.out.print("-");

            if (x == 1) {
                System.out.print("d");
                x = x - 1;
            }

            if (x == 2) {
                System.out.print("b c");
            }

        }
    }
}