/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2017.
 */

class PoolPuzzleEins {
    public static void main(String [] args) {
        int x = 0;

        while ( x < 4 ) {
            System.out.print("da");
            if ( x < 1 ) {
                System.out.print(" ");
            }
                System.out.print("s");
            if ( x > 1 ) {
                System.out.print(" kind");
                x = x + 2;
            }
            if ( x == 1 ) {
                System.out.print("itzend");
            }
            if ( x < 1 ) {
                System.out.print("agt");
            }
            System.out.println("");
            x = x + 1;
        }
    }
}
