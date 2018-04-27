/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package ch.sbb.it42javakurs.kursunterlagen.kurstag04.banane;

public class Banane {
    private String name;
    private String farbe;
    private String form;
    private String geschmack;
    private String duft;
    private boolean delle;
    private static int counter;

    public Banane() {
        counter++;
        this.name = "Ich bin die " + counter + ". Banane und extrem glücklick darüber.";
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(final String farbe) {
        this.farbe = farbe;
    }

    public String getForm() {
        return form;
    }

    public void setForm(final String form) {
        this.form = form;
    }

    public String getGeschmack() {
        return geschmack;
    }

    public void setGeschmack(final String geschmack) {
        this.geschmack = geschmack;
    }

    public String getDuft() {
        return duft;
    }

    public void setDuft(final String duft) {
        this.duft = duft;
    }

    public boolean isDelle() {
        return delle;
    }

    public void setDelle(final boolean delle) {
        this.delle = delle;
    }
}
