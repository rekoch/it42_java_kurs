package ch.sbb.it42.corpattern;

import java.math.BigDecimal;

public class Restbetrag {
    private BigDecimal betrag;

    public Restbetrag(BigDecimal betrag) {
        this.betrag = betrag;
    }

    public BigDecimal getBetrag() {
        return betrag;
    }


    public long getAnzahlMuenzenFuer(BigDecimal muenzenTyp) {
        return betrag.divide(muenzenTyp).intValue();
    }

    public BigDecimal getRestbetragFuer(BigDecimal muenzenTyp) {
        return betrag.subtract(muenzenTyp.multiply(new BigDecimal(getAnzahlMuenzenFuer(muenzenTyp))));
    }
}
