package ch.sbb.it42.corpattern;

import ch.sbb.it42.corpattern.processor.Abschluss;
import ch.sbb.it42.corpattern.processor.Anzeige;
import ch.sbb.it42.corpattern.processor.EinFrankenRueckgabe;
import ch.sbb.it42.corpattern.processor.FuenfFrankenRueckgabe;
import ch.sbb.it42.corpattern.processor.FuenfRappenRueckgabe;
import ch.sbb.it42.corpattern.processor.FuenfzigRappenRueckgabe;
import ch.sbb.it42.corpattern.processor.Processor;
import ch.sbb.it42.corpattern.processor.ZehnRappenRueckgabe;
import ch.sbb.it42.corpattern.processor.ZwanzigRappenRueckgabe;
import ch.sbb.it42.corpattern.processor.ZweiFrankenRueckgabe;

import java.math.BigDecimal;

public class Billettautomat {

    private final Processor ersterProzessor;

    public Billettautomat() {
        // Chain-of-Responsibility aufbauen
        Anzeige anzeige = new Anzeige();
        FuenfFrankenRueckgabe rueckgabe500 = new FuenfFrankenRueckgabe();
        ZweiFrankenRueckgabe rueckgabe200 = new ZweiFrankenRueckgabe();
        EinFrankenRueckgabe rueckgabe100 = new EinFrankenRueckgabe();

        FuenfzigRappenRueckgabe rueckgabe050 = new FuenfzigRappenRueckgabe();
        ZwanzigRappenRueckgabe rueckgabe020 = new ZwanzigRappenRueckgabe();
        ZehnRappenRueckgabe rueckgabe010 = new ZehnRappenRueckgabe();
        FuenfRappenRueckgabe rueckgabe005 = new FuenfRappenRueckgabe();
        Abschluss abschluss = new Abschluss();

        anzeige.setNextProcessor(rueckgabe500);
        rueckgabe500.setNextProcessor(rueckgabe200);
        rueckgabe200.setNextProcessor(rueckgabe100);
        rueckgabe100.setNextProcessor(rueckgabe050);
        rueckgabe050.setNextProcessor(rueckgabe020);
        rueckgabe020.setNextProcessor(rueckgabe010);
        rueckgabe010.setNextProcessor(rueckgabe005);
        rueckgabe005.setNextProcessor(abschluss);

        ersterProzessor = anzeige;

    }

    public void gibRueckgeld(double betrag) {
        Restbetrag restbetrag = new Restbetrag(BigDecimal.valueOf(betrag));

        ersterProzessor.process(restbetrag);
    }
}
