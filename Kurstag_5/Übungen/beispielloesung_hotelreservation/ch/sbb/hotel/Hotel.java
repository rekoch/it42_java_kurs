/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package ch.sbb.hotel;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hotel {

    private Zimmer[] alleZimmer;
    private List<Buchung> alleBestaetigtenBuchungen = new ArrayList<>();

    public Hotel(Zimmer... alleZimmer) {
        this.alleZimmer = alleZimmer;
    }

    /**
     * Ueber diese Methode koennen die Kunden festellen, ob fuer sie noch ein Zimmer frei ist:
     * Wenn die zurückgelieferte Buchung nicht okay ist, dann ist kein Zimmer frei.
     */
    public Buchung erstelleBuchung(Zeitraum zeitraum, Gaeste gaeste, String... gewuenschteFeatures) {
        // finde fuer die gewünschte Anzahl Personen Zimmer, die noch komplett frei sind und die
        // jedes der gewuenschten Features haben:

        List<Zimmer> zuBuchendeZimmer = new ArrayList<>();
        int nochEinzuquartierendePersonen = gaeste.getAnzahl();
        BigDecimal gesamtPreisFuerKompletteBuchung = BigDecimal.ZERO;
        BigDecimal anzahlUebernachtungen = BigDecimal.valueOf(zeitraum.getAnzahlUebernachtungen());
        List<Zimmer> freieZimmer = getFreieZimmer(zeitraum, gewuenschteFeatures);


        // Probiere, die Gaeste optimal auf die freien (passenden) Zimmer zu verteilen:
        while (freieZimmer.size() > 0) {

            Zimmer zimmer = findeNaechstesPassendesZimmer(freieZimmer, nochEinzuquartierendePersonen);

            // Zimmer in die Buchung aufnehmen:
            zuBuchendeZimmer.add(zimmer);
            gesamtPreisFuerKompletteBuchung = gesamtPreisFuerKompletteBuchung.add(zimmer.getKostenProUebernachtung().multiply(anzahlUebernachtungen));
            nochEinzuquartierendePersonen = nochEinzuquartierendePersonen - zimmer.getMaxAnzahlPersonen();
            freieZimmer.remove(zimmer);

            if (nochEinzuquartierendePersonen <= 0) {
                // alle Personen konnten auf noch freie Zimmer verteilt werden, somit kann eine
                // gueltige Buchung erstellt werden:
                return Buchung.erzeugeGueltigeBuchung(gaeste, zeitraum, zuBuchendeZimmer, gesamtPreisFuerKompletteBuchung);
            }
        }

        // Nicht alle Personen konnten auf entsprechende Wunschzimmer verteilt werden im relevanten Zeitraum.
        // Somit kann keine gueltige Buchung erstellt werden:
        return Buchung.erzeugeUngueltigeBuchung();
    }


    public void checkIn(Person person, Buchung buchung) {
        if (!buchung.isBezahlt()) {
            System.out.println("CheckIn von " + person + " nicht moeglich, Buchung wurde nicht bezahlt!");
        } else if (!buchung.getGaeste().enthalten(person)) {
            System.out.println("CheckIn von " + person + " nicht moeglich, er/sie wurde bei dieser Buchung nicht angemeldet!");
        } else {
            // hier muesste eigentlich auch noch geprueft werden, dass sich der Kunde wirklich im
            // gebuchten Zeitraum (und nicht einem anderen!) eincheckt - aber das lassen wir.
            System.out.println("Person " + person + " eingecheckt.");
        }

    }


    public void bestaetige(Buchung buchung) {
        if (buchung.istOkay()) {
            buchung.setBestaetigt();
            alleBestaetigtenBuchungen.add(buchung);
            System.out.println("Buchung ist bestaetigt.");
        } else {
            System.out.println("Buchung kann nicht bestaetigt werden, Buchung ist nicht okay.");
        }
    }


    public List<Zimmer> getFreieZimmer(Zeitraum gewuenschterZeitraum, String... gewuenschteFeatures) {
        // grundsaetzlich alle Zimmer zurueckliefern, die die gewünschten Features aufweisen:
        List<Zimmer> freieZimmer = new ArrayList<>();
        for (Zimmer zimmer : alleZimmer) {
            if (zimmer.hatFeatures(gewuenschteFeatures)) {
                freieZimmer.add(zimmer);
            }
        }
        // ... ausser natuerlich diejenigen, welche schon durch eine bestaetigte Buchung
        // vergeben sind:
        for (Buchung buchung : alleBestaetigtenBuchungen) {
            if (buchung.getZeitraum().enthaeltOderUeberschneidetSichMit(gewuenschterZeitraum)) {
                List<Zimmer> schonBesetzteZimmer = Arrays.asList(buchung.getZimmer());
                freieZimmer.removeAll(schonBesetzteZimmer);
            }
        }
        return freieZimmer;
    }


    private Zimmer findeNaechstesPassendesZimmer(List<Zimmer> zimmer, int anzahlPersonen) {
        // Liefert das naechste Zimmer so, dass es moeglichst gut ausgelastet ist:
        // 1 Person: Einzelzimmer, sonst Doppelzimmer
        // 2 oder mehr Personen: Doppelzimmer, sonst Einzelzimmer
        Zimmer bestPassendesZimmer = null;
        for (Zimmer z : zimmer) {
            if (bestPassendesZimmer == null) {
                bestPassendesZimmer = z;
                continue;
            }
            if (z.getMaxAnzahlPersonen() == Math.min(anzahlPersonen, 2)) {
                // dieses Zimmer passt mindestens so gut wie das bisher beste Zimmer
                bestPassendesZimmer = z;
            }
        }
        return bestPassendesZimmer;
    }
}
