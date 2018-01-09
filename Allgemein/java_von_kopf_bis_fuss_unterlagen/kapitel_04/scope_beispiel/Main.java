/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package kapitel_04.scope_beispiel;

public class Main {

    public static void main(String[] args) {
        Wohnung zweizimmerWohnung = new Wohnung();
        System.out.println(zweizimmerWohnung.getGesamtFlaeche());
    }
}
