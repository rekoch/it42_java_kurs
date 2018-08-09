package ch.sbb.it42.templatepattern;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;

import java.io.IOException;

public class SteuerbescheinigungPdfGenerator extends PdfGenerator {

    @Override
    protected void createEinstiegstext(Document document, Konto konto) throws DocumentException, IOException {
        document.add(createParagraph("Steuerbescheinigung für " + konto.getVorname() + " " + konto.getNachname() + " vom " + getAktuellesDatum() + "\n\n\n"));
    }

    @Override
    protected void createHaupttext(Document document, Konto konto) throws DocumentException, IOException {
        document.add(createParagraph(createBetragZeile("Startbestand", null, konto.getStartKontostand())));
        document.add(createParagraph(createBetragZeile("Endbestand ", null, konto.getEndKontostand())));
        document.add(createParagraph(createBetragZeile("Zins (ohne Verrechnungssteuer)", null, konto.getZins())));
    }

    @Override
    protected void createSchlusstext(Document document) throws DocumentException, IOException {
        document.add(createParagraph("\n\nFür Steuerzwecke verwendbar - bitte aufbewahren!"));
    }
}
