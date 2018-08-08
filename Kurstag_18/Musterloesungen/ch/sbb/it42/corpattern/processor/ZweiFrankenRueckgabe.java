package ch.sbb.it42.corpattern.processor;

import ch.sbb.it42.corpattern.Restbetrag;

import java.math.BigDecimal;

public class ZweiFrankenRueckgabe extends Processor {

    @Override
    public void process(Restbetrag restbetrag) {
        BigDecimal muenzentyp = new BigDecimal("2.00");

        System.out.println("Gib "+restbetrag.getAnzahlMuenzenFuer(muenzentyp) +" x 2 Fr. heraus");

        Restbetrag neuerRestbetrag = new Restbetrag(restbetrag.getRestbetragFuer(muenzentyp));

        getNextProcessor().process(neuerRestbetrag);
    }
}
