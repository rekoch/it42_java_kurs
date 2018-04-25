/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package ch.sbb.it42.generics;

public class Main {

    public static void main(String[] args) {

        DuplikatFinder<String> df1 = new DuplikatFinder<String>();
        df1.add("Müller");
        df1.add("Meier");
        df1.add("Huber");
        System.out.println("Namenduplikat: " + df1.getIrgendeinDuplikat()); // --> null

        df1.add("Meier");
        df1.add("Weber");
        String namenDuplikat = df1.getIrgendeinDuplikat();
        System.out.println("Namenduplikat: " + namenDuplikat); // --> Meier


        DuplikatFinder<Double> doubleDuplikatFinder = new DuplikatFinder<>();
        doubleDuplikatFinder.add(new Double(23.3));
        doubleDuplikatFinder.add(new Double(42.0));

        Double doubleDuplikat =  doubleDuplikatFinder.getIrgendeinDuplikat();
        System.out.println("Double-Duplikat: " + doubleDuplikat);

        //doubleDuplikatFinder.add("Müller");  // <-- geht jetzt nicht mehr
    }
}
