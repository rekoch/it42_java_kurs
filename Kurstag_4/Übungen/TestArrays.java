/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2017.
 */

class TestArrays {

    public static void main(String[] args) {
        int[] index = new int[4];
        String[] inseln = new String[4];
        index[0] = 1;
        index[1] = 3;
        index[2] = 0;
        index[3] = 2;
        inseln[0] = "Bermudas";
        inseln[1] = "Fidschi";
        inseln[2] = "Azoren";
        inseln[3] = "Kuba";

        int y = 0;

        int ref;
        while (y < 4){
            ref = index[y];
            System.out.print("Insel = ");
            System.out.println(inseln[ref]);
            y = y + 1;
        }


    }
}