/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2017.
 */

package kapitel_03;


/**
 * Ausprobieren mit VM Option  -Xmx300m  oder mit  -Xmx1g
 *
 * cd /d/devsbb/workspaces/it42/it42_java_kurs/out/production/Allgemein
 * java kapitel_04.OutOfMemory
 * java -Xmx300m kapitel_04.OutOfMemory
 * java -Xmx1g kapitel_04.OutOfMemory
 * riesenArray[Math.max(i - 5, 0)] = null;
 */
public class OutOfMemory {
    private static final int ANZAHL_ARRAYS = 10_000;
    private static final int ANZAHL_INTS_PRO_ARRAY = 10_000;


    public static void main(String[] args) {
        int[][] riesenArray = new int[ANZAHL_ARRAYS][];

        for (int i = 0; i < ANZAHL_ARRAYS; i++) {
            riesenArray[i] = new int[ANZAHL_INTS_PRO_ARRAY];
            System.out.println("Array " + i + " gefuellt");
        }
    }
}
