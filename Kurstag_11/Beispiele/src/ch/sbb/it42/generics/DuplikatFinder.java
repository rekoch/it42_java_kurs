/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package ch.sbb.it42.generics;

import java.util.ArrayList;
import java.util.List;

// Diese Datenstruktur wurde zuerst f�r den java.lang.Object-Typ gebaut,
// hier ist die generifizierte Version mit T (siehe Git-History)

public class DuplikatFinder<T> {
    private List<T> bestehendeElemente = new ArrayList<T>();
    private T duplikat = null;

    public void add(T element) {
        if (bestehendeElemente.contains(element)) {
            duplikat = element;
        }
        bestehendeElemente.add(element);
    }

    public T getIrgendeinDuplikat() {
        return duplikat;
    }
}
