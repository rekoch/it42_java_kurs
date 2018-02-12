/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package ch.sbb.hotel;

import java.math.BigDecimal;
import java.util.List;

public class Buchung {

    private Gaeste gaeste;

    private Zeitraum zeitraum;

    private boolean bezahlt;

    private boolean okay = true;

    private boolean bestaetigt;

    private BigDecimal preis;

    private Zimmer[] zimmer;

    public boolean istOkay() {
        return okay;
    }

    private Buchung() {
        // direkte Instanzierung einer Buchung unterbinden, deshalb private
    }

    public static Buchung erzeugeGueltigeBuchung(Gaeste gaeste, Zeitraum zeitraum, List<Zimmer> zimmer, BigDecimal preis) {
        Buchung b = new Buchung();
        b.gaeste = gaeste;
        b.zeitraum = zeitraum;
        b.preis = preis;
        b.okay = true;
        b.bestaetigt = false;
        b.bezahlt = false;
        b.zimmer = zimmer.toArray(new Zimmer[zimmer.size()]); // aus Liste ein Array machen
        return b;
    }

    public static Buchung erzeugeUngueltigeBuchung() {
        Buchung buchung = new Buchung();
        buchung.okay = false;
        return buchung;
    }

    public void setBestaetigt() {
        this.bestaetigt = true;
    }

    public boolean isBestaetigt() {
        return bestaetigt;
    }

    public BigDecimal getPreis() {
        return preis;
    }

    public boolean isBezahlt() {
        return bezahlt;
    }

    public void setBezahlt() {
        this.bezahlt = true;
    }

    public Zeitraum getZeitraum() {
        return zeitraum;
    }

    public Zimmer[] getZimmer() {
        return zimmer;
    }

    public Gaeste getGaeste() {
        return gaeste;
    }
}
