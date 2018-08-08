package ch.sbbb.it42.templatepattern;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Konto {
    private final String vorname;
    private final String nachname;
    private final BigDecimal startKontostand;
    private final List<KontoBewegung> kontoBewegungen = new ArrayList<>();

    public Konto(String vorname, String nachname, BigDecimal startKontostand) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.startKontostand = startKontostand;
    }

    public void addEinzahlung(String text, BigDecimal betrag) {
        kontoBewegungen.add(new KontoBewegung(KontoBewegung.Art.EINZAHLUNG, text, betrag));
    }

    public void addAuszahlung(String text, BigDecimal betrag) {
        kontoBewegungen.add(new KontoBewegung(KontoBewegung.Art.AUSZAHLUNG, text, betrag));
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public BigDecimal getStartKontostand() {
        return startKontostand;
    }

    public List<KontoBewegung> getKontoBewegungen() {
        return new ArrayList<>(kontoBewegungen);
    }

    public BigDecimal getEndKontostand() {
        BigDecimal kontostand = startKontostand;
        for (KontoBewegung kontoBewegung : kontoBewegungen) {
            if (kontoBewegung.getArt() == KontoBewegung.Art.AUSZAHLUNG) {
                kontostand = kontostand.subtract(kontoBewegung.getBetrag());
            } else {
                kontostand = kontostand.add(kontoBewegung.getBetrag());
            }
        }
        return kontostand;
    }

    public BigDecimal getZins() {
        return new BigDecimal("3.25"); // diese Methode ist nicht fertig implementiert, das ist aber egal.
    }
}
