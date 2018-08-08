package ch.sbbb.it42.templatepattern;

import java.math.BigDecimal;

public class KontoBewegung {

    public enum Art {
        AUSZAHLUNG, EINZAHLUNG
    }

    private final Art art;
    private final String text;
    private final BigDecimal betrag;

    public KontoBewegung(Art art, String text, BigDecimal betrag) {
        this.art = art;
        this.text = text;
        this.betrag = betrag;
    }

    public Art getArt() {
        return art;
    }

    public String getText() {
        return text;
    }

    public BigDecimal getBetrag() {
        return betrag;
    }

}
