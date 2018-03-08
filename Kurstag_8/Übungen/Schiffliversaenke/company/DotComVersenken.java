import java.util.ArrayList;

public class DotComVersenken {

    private  SpielHelfer helfer = new SpielHelfer();
    private ArrayList<EinfachesDotCom> dotComListe = new ArrayList<EinfachesDotCom>();
    private int anzahlVersuche = 0;
    public static final int BOARD_SIZE = 7;

    private void spielEinrichten(){
        EinfachesDotCom eins = new EinfachesDotCom();
        eins.setName("Haustiere.com");
        EinfachesDotCom zwei = new EinfachesDotCom();
        zwei.setName("BioWare.com");
        EinfachesDotCom drei = new EinfachesDotCom();
        drei.setName("FragMich.com");
        dotComListe.add(eins);
        dotComListe.add(zwei);
        dotComListe.add(drei);

        System.out.println("Ihre Aufgabe ist es, drei Dot_Coms zu versenken.");
        System.out.println("Haustiere.com, BioWare.com, FragMich.com");
        System.out.println("Versichen Sie, sie mit so wenig Versuchen wie möglich zu erledigen.");

        displayBattleshipBoard();

        for (EinfachesDotCom aktuellesDotCom : dotComListe) {
            ArrayList<String> neuerOrt = helfer.platziereDotCom(3);
            aktuellesDotCom.setZellorte(neuerOrt);
        }
    }

    private void beginneSpiel(){
        while (!dotComListe.isEmpty()){
            String rateversuch = helfer.getBenutzereingabe("Geben Sie einen Rateversuch ein");
            pruefeRateversuch(rateversuch);
        }
        beendeSpiel();
    }

    private void beendeSpiel() {
        System.out.println("Alle Dot-Coms sind versteckt! Ihre Aktien sind wertlos.");
        if (anzahlVersuche < 18){
            System.out.println("Sie haben nur " + anzahlVersuche + "Versuche benötigt. Sie erhalten den KinoWelt-Preis");
        } else{
            System.out.println("Hat ja lange gedauert. "+ anzahlVersuche + " Versucher.");
            System.out.println("Warum sind Sie nicht ausgestiegen, bevor der Kurs in den Keller fiel?");
        }
    }

    private void pruefeRateversuch(String rateversuch) {
        anzahlVersuche++;
        String ergebnis = "Vorbei";

        for (EinfachesDotCom aktuellesDotCom : dotComListe) {
            ergebnis = aktuellesDotCom.pruefDich(rateversuch);
            if ("Treffer".equals(ergebnis)){
                break;
            }
            if ("Versenkt".equals(ergebnis)){
                dotComListe.remove(aktuellesDotCom);
                break;
            }
            break;
        }
    }

    public void displayBattleshipBoard(){
        for (int row = 0; row < BOARD_SIZE; row++)
        {
            System.out.println("");
            System.out.println("---------------------------");

            for (int column = 0; column < BOARD_SIZE; column++)
            {
                System.out.print("| " + " " + " ");
            }
        }
        System.out.println("");
        System.out.println("---------------------------");
    }



    public static void main(String[] args) {
        DotComVersenken spiel = new DotComVersenken();
        spiel.spielEinrichten();
        spiel.beginneSpiel();
    }
}
