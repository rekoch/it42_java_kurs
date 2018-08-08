package ch.sbbb.it42.templatepattern;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) throws Exception {
        Konto konto = new Konto("Fritz", "Mueller", BigDecimal.valueOf(200.0));
        konto.addEinzahlung("Überweisung von PC-Konto 45-45346-3", BigDecimal.valueOf(30.0));
        konto.addAuszahlung("Bezug am Bankomat im Bahnhof Bern", BigDecimal.valueOf(80.0));
        konto.addAuszahlung("Zahlung mit Kreditkarte 2345-3454-4354-XXXX", BigDecimal.valueOf(43.55));
        konto.addEinzahlung("Lohnzahlung von SBB", BigDecimal.valueOf(1234.00));

        KontoauszugPdfGenerator kaGenerator = new KontoauszugPdfGenerator();
        kaGenerator.generierePdf(konto, "C:\\temp\\kontoauszug.pdf");

        //TODO
        //SteuerbescheinigungPdfGenerator sbGenerator = new SteuerbescheingungPdfGenerator();
        //sbGenerator.generierePdf(konto, "C:\\temp\\steuerbescheinigung.pdf");
    }
}
