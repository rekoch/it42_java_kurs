package ch.sbb.it42.projektverwaltung;

import java.util.ArrayList;
import java.util.List;

public class Projekt implements Aktivitaet {
    private final String name;
    private List<Aktivitaet> aktivitaeten = new ArrayList<>();

    public Projekt(String name) {
        this.name = name;
    }

    public void add(Aktivitaet aktivitaet) {
        aktivitaeten.add(aktivitaet);
    }

    @Override
    public double getGesamtDauer() {
        double gesamtDauer = 0.0;
        for (Aktivitaet aktivitaet : aktivitaeten) {
            gesamtDauer = gesamtDauer + aktivitaet.getGesamtDauer();
        }
        return gesamtDauer;
    }

    @Override
    public String getPlan(String einrueckung) {
        String s = einrueckung + name + "\n";
        for (Aktivitaet aktivitaet : aktivitaeten) {
            s = s + aktivitaet.getPlan(einrueckung + "    "); // Unterprojekte sind 4 weitere Leerzeichen eingerueckt
        }
        return s;
    }

    @Override
    public String toString() {
        return "Projekt{" +
                "name='" + name + '\'' +
                '}';
    }
}
