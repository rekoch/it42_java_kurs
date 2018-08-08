package ch.sbb.it42.corpattern.processor;

import ch.sbb.it42.corpattern.Restbetrag;

import java.math.BigDecimal;

public class ZwanzigRappenRueckgabe extends Processor {

    @Override
    public void process(Restbetrag restbetrag) {
        BigDecimal muenzentyp = new BigDecimal("0.20");

        System.out.println("Gib "+restbetrag.getAnzahlMuenzenFuer(muenzentyp) +" x 20 Rp. heraus");

        Restbetrag neuerRestbetrag = new Restbetrag(restbetrag.getRestbetragFuer(muenzentyp));

        getNextProcessor().process(neuerRestbetrag);
    }
}
