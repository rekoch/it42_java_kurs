import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class PhraseOMaticFehlerbehandlung {

    private static List<String> liesWoerterAusDatei(String filename) throws IOException {
        // BufferedReader fuer File aufmachen, welches sich im Projekt an derselben Stelle findet wie die
        // Java-Klassen:
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        PhraseOMaticFehlerbehandlung.class.getClassLoader().
                                getResourceAsStream(filename)));

        List<String> words = new ArrayList<>();
        while (true) {
            String line = reader.readLine();
            if (line == null || line.isEmpty()) {
                break;
            }
            words.add(line);
        }
        reader.close();
        return words;
    }


    public static void main(String[] args) throws IOException {
        // drei Wortgruppen erstellen, aus denen ausgewählt wird
        List<String> wortListeEins = liesWoerterAusDatei("wortliste1.txt");

        List<String> wortListeZwei = liesWoerterAusDatei("wortliste2.txt");

        List<String> wortListeDrei = liesWoerterAusDatei("wortliste3.txt");

        // ermitteln, wie viele Worte sich in jeder Liste befinden
        int einsLänge = wortListeEins.size();
        int zweiLänge = wortListeZwei.size();
        int dreiLänge = wortListeDrei.size();

        // drei Zufallszahlen generieren, um Wörter aus den Listen herauszuziehen

        BufferedReader inReader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println();
            System.out.println("Wieviele Phrasen soll ich labern? (0 = Abbruch)");
            String eingabe = inReader.readLine();

            int anzahlPhrasen;
            try {
                anzahlPhrasen = Integer.parseInt(eingabe);
            } catch (NumberFormatException nfe) {
                System.out.println("Du sollst eine Ganzzahl eingeben, du ...!");
                continue;
            }
            if (anzahlPhrasen < 0) {
                System.out.println("Ich kann nur eine positive Anzahl Phrasen labern.");
                continue;
            }
            if (99 < anzahlPhrasen) {
                System.out.println("Ich will nicht so viele Phrasen labern.");
                continue;
            }
            if (anzahlPhrasen == 0) {
                break;
            }
            for (int i = 0; i < anzahlPhrasen; i++) {
                int rand1 = (int) (Math.random() * einsLänge);
                int rand2 = (int) (Math.random() * zweiLänge);
                int rand3 = (int) (Math.random() * dreiLänge);

                // eine Phrase zusammenbauen
                String phrase = wortListeEins.get(rand1) + " " + wortListeZwei.get(rand2) + " " + wortListeDrei.get(rand3);

                // eine Phrase ausgeben
                System.out.println("Was wir brauchen ist eine " + phrase);
            }
        }
        System.out.println("Habe fertig.");
    }
}   

