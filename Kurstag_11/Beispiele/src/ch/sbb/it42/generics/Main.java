/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package ch.sbb.it42.generics;

public class Main {

    public static void main(String[] args) {


        DuplikatFinder df1 = new DuplikatFinder();
        df1.add("Müller");
        df1.add("Meier");
        df1.add("Huber");
        System.out.println("Namenduplikat: " + df1.getIrgendeinDuplikat()); // --> null

        df1.add("Meier");
        df1.add("Weber");
        Object namenDuplikat = df1.getIrgendeinDuplikat();
        System.out.println("Namenduplikat: " + namenDuplikat); // --> Meier


        DuplikatFinder doubleDuplikatFinder = new DuplikatFinder();
        doubleDuplikatFinder.add(new Double(23.3));
        doubleDuplikatFinder.add(new Double(42.0));

        Object doubleDuplikat = doubleDuplikatFinder.getIrgendeinDuplikat();
        System.out.println("Double-Duplikat: " + doubleDuplikat);

        //geht nicht:
        //doubleDuplikatFinder.add("Müller");
    }
}
