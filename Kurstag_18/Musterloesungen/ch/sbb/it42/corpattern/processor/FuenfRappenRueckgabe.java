package ch.sbb.it42.corpattern.processor;

import ch.sbb.it42.corpattern.Restbetrag;

import java.math.BigDecimal;

public class FuenfRappenRueckgabe extends Processor {

    @Override
    public void process(Restbetrag restbetrag) {
        BigDecimal muenzentyp = new BigDecimal("0.05");

        System.out.println("Gib " + restbetrag.getAnzahlMuenzenFuer(muenzentyp) + " x 5 Rp. heraus");

        Restbetrag neuerRestbetrag = new Restbetrag(restbetrag.getRestbetragFuer(muenzentyp));

        getNextProcessor().process(neuerRestbetrag);
    }
}
