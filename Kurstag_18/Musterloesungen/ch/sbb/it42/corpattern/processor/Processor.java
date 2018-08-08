package ch.sbb.it42.corpattern.processor;

import ch.sbb.it42.corpattern.Restbetrag;

public abstract class Processor {
    private Processor next;

    public void setNextProcessor(Processor next) {
        this.next = next;
    }

    protected Processor getNextProcessor() {
        return next;
    }

    public abstract void process(Restbetrag restbetrag);
}
