package ch.sbb.it42.adressverwaltung;

import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class AdressIterator implements Iterator<Adresse> {
    private final List<Adresse> adressen;
    private int position;

    public AdressIterator(List<Adresse> adressen) {
        this.adressen = adressen;
        position = -1;
    }

    @Override
    public boolean hasNext() {
        position++;
        return (position < adressen.size());
    }

    @Override
    public Adresse next() {
        if (position < adressen.size()) {
            return adressen.get(position);
        }
        throw new IllegalStateException("next() ausgefuehrt, ohne dass hasNext() true zurueckgeliefert hat");
    }

    @Override
    public void remove() {
        if (adressen.size() <= position) {
            throw new IllegalStateException("remove() wurde ausgeführt, ohne dass hasNext() true zurueckgeliefert hat");
        }
        adressen.remove(position);
        position--;
    }

    @Override
    public void forEachRemaining(Consumer<? super Adresse> action) {
        // nicht implementiert
    }
}
