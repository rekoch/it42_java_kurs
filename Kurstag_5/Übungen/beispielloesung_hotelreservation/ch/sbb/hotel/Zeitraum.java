/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package ch.sbb.hotel;


/**
 * Ein Zeitbereich, definiert durch den Eincheck-/Start-Tag bzw. den Auscheck-/Schluss-Tag
 * Immutable Klasse, keine Setter!
 */
public class Zeitraum {
    private final Datum vonDatum;

    private final Datum bisDatum;

    public Zeitraum(Datum vonDatum, Datum bisDatum) {
        this.vonDatum = vonDatum;
        this.bisDatum = bisDatum;
    }

    public Zeitraum(int tagVon, int tagBis) {
        this(new Datum(tagVon), new Datum(tagBis));
    }

    public boolean enthaeltOderUeberschneidetSichMit(Zeitraum andererZeitraum) {
        return vonDatum.kommtVor(andererZeitraum.bisDatum) && andererZeitraum.vonDatum.kommtVor(bisDatum);
    }

    public int getAnzahlUebernachtungen() {
        return bisDatum.getTagNummer() - vonDatum.getTagNummer();
    }
}
