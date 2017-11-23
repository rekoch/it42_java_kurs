/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2017.
 */

package ch.sbb;

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
