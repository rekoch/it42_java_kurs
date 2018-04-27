/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package ch.sbb.it42javakurs.kursunterlagen.kurstag09.accessmodifier;

public class Haustier {
    private String name;
    private double gewichtInKilogramm;


    public Haustier() {
    }

    public Haustier(String name) {
        setName(name);
    }

    private Haustier(String name, float kilogramm) {
        this.name = name;
        this.gewichtInKilogramm = kilogramm;
    }


    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public double getGewichtInKilogramm() {
        return gewichtInKilogramm;
    }

    public void setGewichtInKilogramm(double gewichtInKilogramm) {
        this.gewichtInKilogramm = gewichtInKilogramm;
    }


    public void spiele() {
        System.out.println(name + " spielt...");
    }
}
