package ch.sbb.it42.corpattern.processor;

import ch.sbb.it42.corpattern.Restbetrag;

public class Abschluss extends Processor {

    @Override
    public void process(Restbetrag restbetrag) {
        System.out.println("Auf Wiedersehen!");
        // kein Aufruf des naechsten Prozessors, weil dies der letzte Verarbeitungsschritt ist!
    }
}
