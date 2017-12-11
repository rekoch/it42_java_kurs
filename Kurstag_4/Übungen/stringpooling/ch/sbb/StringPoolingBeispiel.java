/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2017.
 */

package ch.sbb;

public class StringPoolingBeispiel {

    private static String erzeugeStringDerLaenge10000() {
        StringBuilder s = new StringBuilder();
        for (int j = 0; j < 1_000; j++) {
            s.append((j + 1_000_000_000));
        }
        return s.toString();
    }


    public static void main(String[] args) {
        String[] riesenArray = new String[40_000];
        for (int i = 0; i < riesenArray.length; i++) {

            String langerString = erzeugeStringDerLaenge10000();
            // langerString = langerString.intern(); // OutOfMemoryError vermeiden durch diese Zeile
            if (i == 1 || i==2) {
                System.out.println(langerString);
            }
            riesenArray[i] = langerString;

        }
        System.out.println("Riesenarray ist gefuellt!");
    }
}
