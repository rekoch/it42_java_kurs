package ch.sbb.it42.templatepattern;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;

import java.io.IOException;

public class KontoauszugPdfGenerator extends PdfGenerator {

    @Override
    protected void createEinstiegstext(Document document, Konto konto) throws DocumentException, IOException {
        document.add(createParagraph("Kontoauszug für " + konto.getVorname() + " " + konto.getNachname() + " vom " + getAktuellesDatum() + "\n\n\n"));

    }

    @Override
    protected void createHaupttext(Document document, Konto konto) throws DocumentException, IOException {
        document.add(createParagraph(createBetragZeile("Startbestand", null, konto.getStartKontostand())));
        document.add(createParagraph("\n"));
        for (KontoBewegung kontoBewegung : konto.getKontoBewegungen()) {
            document.add(createParagraph(createBetragZeile(kontoBewegung.getText(), kontoBewegung.getArt(), kontoBewegung.getBetrag())));
        }
        document.add(createParagraph("\n"));
        document.add(createParagraph(createBetragZeile("Endbestand ", null, konto.getEndKontostand())));
    }

    @Override
    protected void createSchlusstext(Document document) throws DocumentException, IOException {
        document.add(createParagraph("\n\nMfg\nIhre Bank"));
    }
}
