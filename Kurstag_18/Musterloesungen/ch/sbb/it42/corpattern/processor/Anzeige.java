package ch.sbb.it42.corpattern.processor;

import ch.sbb.it42.corpattern.Restbetrag;

import java.math.BigDecimal;

public class Anzeige  extends Processor {

    @Override
    public void process(Restbetrag restbetrag) {

        System.out.println("Sie erhalten: "+restbetrag.getBetrag());

        getNextProcessor().process(restbetrag);
    }
}
