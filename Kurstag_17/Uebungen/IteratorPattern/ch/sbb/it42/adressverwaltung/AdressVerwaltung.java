package ch.sbb.it42.adressverwaltung;

import java.util.ArrayList;
import java.util.List;

public class AdressVerwaltung {

    private List<Adresse> adressen = new ArrayList<>();

    public void add(Adresse adresse) {
        adressen.add(adresse);
    }

    public int getAnzahlAdressen() {
        return adressen.size();
    }

    public Adresse getAdresse(int i) {
        return adressen.get(i);
    }
}
