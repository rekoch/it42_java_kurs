/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package ch.sbb.it42javakurs.kursunterlagen.kurstag05;

/**
 * cd /d/devsbb/workspaces/it42/it42_java_kurs/out/production/Allgemein
 * mit 42
 * mit 10042
 * java ch.sbb.it42javakurs.javavonkopfbisfuss.kapitel_04.StackOverflow
 * java -Xss100m ch.sbb.it42javakurs.javavonkopfbisfuss.kapitel_04.StackOverflow
 */
public class StackOverflow {

    public static void schreibeZahlen1Bis(int n) {
        if (n > 1) {
            schreibeZahlen1Bis(n - 1);
        }
        System.out.println(n);
    }


    public static void main(String[] args) {
        schreibeZahlen1Bis(10042);
    }
}
