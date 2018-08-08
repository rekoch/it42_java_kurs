package ch.sbb.it42.corpattern.processor;

import ch.sbb.it42.corpattern.Restbetrag;

import java.math.BigDecimal;

public class ZehnRappenRueckgabe extends Processor {

    @Override
    public void process(Restbetrag restbetrag) {
        BigDecimal muenzentyp = new BigDecimal("0.10");

        System.out.println("Gib "+restbetrag.getAnzahlMuenzenFuer(muenzentyp) +" x 10 Rp. heraus");

        Restbetrag neuerRestbetrag = new Restbetrag(restbetrag.getRestbetragFuer(muenzentyp));

        getNextProcessor().process(neuerRestbetrag);
    }
}
