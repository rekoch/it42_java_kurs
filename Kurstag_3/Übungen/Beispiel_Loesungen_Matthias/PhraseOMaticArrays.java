import java.util.Arrays;
import java.util.List;

public class PhraseOMaticArrays {
    public static void main(String[] args) {

        // drei Wortgruppen erstellen, aus denen ausgewählt wird
        List<String> wortListeEins = Arrays.asList("24/7", "Multi-Tier", "Enterprise", "B2B", "erfolgsorientierte", "Frontend", "webbasierte", "allumfassende", "klevere", "fulltime", "pfadkritische", "dynamische");

        List<String> wortListeZwei = Arrays.asList("gepowerte", "haftende", "mehrwert", "orientierte", "zentrierte", "verteilte", "geclusterte", "Off-the-Shelft", "Out-of-the-Box", "positionierte", "vernetzte", "fokusierte", "kraftvolle", "geordnete", "zielgerichtete", "geteilte", "kooperative", "beschleunigte");

        List<String> wortListeDrei = Arrays.asList("Schicht", "Endstufe", "Lösung", "Architektur", "Kernkompetenz", "Strategie", "Kooperation", "Kundenorientierung", "Raumlichkeit", "Vision", "´Dimension", "Mission");

        // ermitteln, wie viele Worte sich in jeder Liste befinden
        int einsLänge = wortListeEins.size();
        int zweiLänge = wortListeZwei.size();
        int dreiLänge = wortListeDrei.size();

        // drei Zufallszahlen generieren, um Wörter aus den Listen herauszuziehen
        int rand1 = (int) (Math.random() * einsLänge);
        int rand2 = (int) (Math.random() * zweiLänge);
        int rand3 = (int) (Math.random() * dreiLänge);

        // eine Phrase zusammenbauen
        String phrase = wortListeEins.get(rand1) + " " + wortListeZwei.get(rand2) + " " + wortListeDrei.get(rand3);

        // eine Phrase ausgeben
        System.out.println("Was wir brauchen ist eine " + phrase);
    }
}   

