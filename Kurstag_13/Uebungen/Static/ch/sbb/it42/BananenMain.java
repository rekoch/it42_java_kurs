package ch.sbb.it42;

import java.util.ArrayList;
import java.util.List;

public class BananenMain {

    public static void main(String[] args) {
        new BananenMain().run();
    }

    private void run() {
        List<Banane> allBananasOfThisWorld = new ArrayList<>();

        allBananasOfThisWorld.add(new Banane());
        allBananasOfThisWorld.add(new Banane());
        allBananasOfThisWorld.add(new Banane());
        allBananasOfThisWorld.add(new Banane());
        allBananasOfThisWorld.add(new Banane());
        allBananasOfThisWorld.add(new Banane());
        allBananasOfThisWorld.add(new Banane());
        allBananasOfThisWorld.add(new Banane());
        allBananasOfThisWorld.add(new Banane());
        allBananasOfThisWorld.add(new Banane());
        allBananasOfThisWorld.add(new Banane());
        allBananasOfThisWorld.add(new Banane());

        //fixme: fixe das Problem. Jede Banane soll seine eindeutige ID erhalten (1, 2, 3 etc...)
        for (Banane banane : allBananasOfThisWorld){
            System.out.printf("I am Banane number %d", banane.getCounter());
            System.out.println();
        }
    }

}
