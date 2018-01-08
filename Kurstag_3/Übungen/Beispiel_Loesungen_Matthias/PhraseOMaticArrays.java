import java.util.Arrays;
import java.util.List;

public class PhraseOMaticArrays {
    public static void main(String[] args) {

        // drei Wortgruppen erstellen, aus denen ausgew�hlt wird
        List<String> wortListeEins = Arrays.asList("24/7", "Multi-Tier", "Enterprise", "B2B", "erfolgsorientierte", "Frontend", "webbasierte", "allumfassende", "klevere", "fulltime", "pfadkritische", "dynamische");

        List<String> wortListeZwei = Arrays.asList("gepowerte", "haftende", "mehrwert", "orientierte", "zentrierte", "verteilte", "geclusterte", "Off-the-Shelft", "Out-of-the-Box", "positionierte", "vernetzte", "fokusierte", "kraftvolle", "geordnete", "zielgerichtete", "geteilte", "kooperative", "beschleunigte");

        List<String> wortListeDrei = Arrays.asList("Schicht", "Endstufe", "L�sung", "Architektur", "Kernkompetenz", "Strategie", "Kooperation", "Kundenorientierung", "Raumlichkeit", "Vision", "�Dimension", "Mission");

        // ermitteln, wie viele Worte sich in jeder Liste befinden
        int einsL�nge = wortListeEins.size();
        int zweiL�nge = wortListeZwei.size();
        int dreiL�nge = wortListeDrei.size();

        // drei Zufallszahlen generieren, um W�rter aus den Listen herauszuziehen
        int rand1 = (int) (Math.random() * einsL�nge);
        int rand2 = (int) (Math.random() * zweiL�nge);
        int rand3 = (int) (Math.random() * dreiL�nge);

        // eine Phrase zusammenbauen
        String phrase = wortListeEins.get(rand1) + " " + wortListeZwei.get(rand2) + " " + wortListeDrei.get(rand3);

        // eine Phrase ausgeben
        System.out.println("Was wir brauchen ist eine " + phrase);
    }
}   

