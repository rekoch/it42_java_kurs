/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package ch.sbb.it42.generics;

import java.util.ArrayList;
import java.util.List;

public class DuplikatFinder {
    private List bestehendeElemente = new ArrayList();
    private Object duplikat = null;

    public void add(Object element) {
        if (bestehendeElemente.contains(element)) {
            duplikat = element;
        }
        bestehendeElemente.add(element);
    }

    public Object getIrgendeinDuplikat() {
        return duplikat;
    }
}
