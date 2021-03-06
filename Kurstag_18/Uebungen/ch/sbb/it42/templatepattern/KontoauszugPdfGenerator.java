package ch.sbb.it42.templatepattern;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

public class KontoauszugPdfGenerator {

    public void generierePdf(Konto konto, String pdfFilename) throws DocumentException, IOException {
        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream(pdfFilename));
        document.open();
        document.add(createParagraph("Kontoauszug f�r " + konto.getVorname() + " " + konto.getNachname() + " vom " + getAktuellesDatum() + "\n\n\n"));
        document.add(createParagraph(createBetragZeile("Startbestand", null, konto.getStartKontostand())));
        document.add(createParagraph("\n"));
        for (KontoBewegung kontoBewegung : konto.getKontoBewegungen()) {
            document.add(createParagraph(createBetragZeile(kontoBewegung.getText(), kontoBewegung.getArt(), kontoBewegung.getBetrag())));
        }
        document.add(createParagraph("\n"));
        document.add(createParagraph(createBetragZeile("Endbestand ", null, konto.getEndKontostand())));
        document.add(createParagraph("\n\nMfg\nIhre Bank"));
        document.close();
    }


    // Hilfsmethoden (Detail/unwichtig)

    protected String createBetragZeile(String text, KontoBewegung.Art art, BigDecimal value) {
        return String.format("%-60.60s", text) + getVorzeichen(art) + format(value);
    }

    protected Paragraph createParagraph(String text) throws IOException, DocumentException {
        BaseFont basefont = BaseFont.createFont(BaseFont.COURIER, BaseFont.WINANSI, BaseFont.NOT_EMBEDDED);
        Font font = new Font(basefont, 12);
        return new Paragraph(text, font);
    }

    protected String getAktuellesDatum() {
        return new SimpleDateFormat("dd.MM.yyyy").format(new Date());
    }

    private String getVorzeichen(KontoBewegung.Art art) {
        if (art == null) {
            return " ";
        } else {
            return art == AUSZAHLUNG ? "-" : "+";
        }
    }

    private String format(BigDecimal betrag) {
        return String.format("%10.2f", betrag.doubleValue());
    }
}
