/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

import java.util.ArrayList;

public class DotComVersenken {
    SpielHelfer helfer = new SpielHelfer();
    ArrayList<DotCom> dotComListe = new ArrayList<DotCom>();
    int anzahlVersuche = 0;

    private void spielEinrichten(){
        DotCom eins = new DotCom();
        eins.setName("Google.ch");
        DotCom zwei = new DotCom();
        zwei.setName("SBB.ch");
        DotCom drei = new DotCom();
        drei.setName("login.ch");

        dotComListe.add(eins);
        dotComListe.add(zwei);
        dotComListe.add(drei);

        for (DotCom aktuellesDotCom : dotComListe){
            ArrayList<String> neuerOrt = helfer.platziereDotCom(3);
        }
    }

    private void beginneSpiel(){

    }

    private void prüfeRateversuch(){

    }

    private void beendeSpiel(){

    }
}
