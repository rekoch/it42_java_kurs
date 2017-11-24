/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2017.
 */

package Lektion03;

public class PoolPuzzleEins {
    public static void main(String[] args) {
        int x = 0;

        while (x < 4){
            System.out.print("da");
            if ( x < 1) {
                System.out.print(" ");
            }
            System.out.println("sagt");
            if (x < 1){
                x = x + 2;
                System.out.print("dasitzend");
            }

            if ( x == 1 ) {
                System.out.print("das");
            }

            if (x > 3) {
                System.out.print(" kind");
            }
            System.out.println("");
            x = x + 1;
        }
    }
}
