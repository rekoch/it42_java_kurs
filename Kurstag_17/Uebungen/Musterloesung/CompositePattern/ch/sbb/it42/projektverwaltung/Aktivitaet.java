package ch.sbb.it42.projektverwaltung;

public interface Aktivitaet {

    /**
     * Liefert die Dauer aller zu dieser Aktivataet gehoerenden Projekte, Sub-Projekte,... und Tasks.
     */
    double getGesamtDauer();

    /**
     * Liefert dieses Projekt/Task samt allen Unterprojekten/Tasks mit der gewuenschten Einrueckung.
     *
     * @param einrueckung eine beliebige Anzahl Leerzeichen
     */
    String getPlan(String einrueckung);
}
