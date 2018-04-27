/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package ch.sbb.it42javakurs.kursunterlagen.kurstag04.banane;

import java.util.ArrayList;
import java.util.List;

public class BananenRunner {
    public void startApplication(){
        final List<Banane> bananes = new ArrayList<>();

        bananes.add(new Banane());
        bananes.add(new Banane());
        bananes.add(new Banane());
        bananes.add(new Banane());
        bananes.add(new Banane());
        bananes.add(new Banane());
        bananes.add(new Banane());
        bananes.add(new Banane());
        bananes.add(new Banane());
        bananes.add(new Banane());
        bananes.add(new Banane());

        for (final Banane banane : bananes){
            System.out.println(banane.getName());
        }
    }
}
