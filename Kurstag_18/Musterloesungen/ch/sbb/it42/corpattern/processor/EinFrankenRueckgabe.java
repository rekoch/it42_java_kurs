package ch.sbb.it42.corpattern.processor;

import ch.sbb.it42.corpattern.Restbetrag;

import java.math.BigDecimal;

public class EinFrankenRueckgabe extends Processor {

    @Override
    public void process(Restbetrag restbetrag) {
        BigDecimal muenzentyp = new BigDecimal("1.00");

        System.out.println("Gib " + restbetrag.getAnzahlMuenzenFuer(muenzentyp) + " x 1 Fr. heraus");

        Restbetrag neuerRestbetrag = new Restbetrag(restbetrag.getRestbetragFuer(muenzentyp));

        getNextProcessor().process(neuerRestbetrag);
    }
}
