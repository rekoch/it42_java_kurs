/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package kapitel_04.scope_beispiel;

public class Wohnung {
    private Zimmer[] zimmer;

    public Wohnung() {
        zimmer = new Zimmer[2];
        zimmer[0] = new Zimmer(6.5, 4.0, "hellblau");
        zimmer[1] = new Zimmer(4.5, 7.0);
    }

    double getGesamtFlaeche() {
        double flaeche = 0.0;
        for (Zimmer z : zimmer) {
            z.berechneFlaeche();
            flaeche = flaeche + z.getFlaeche();
        }
        return flaeche;
    }

}
