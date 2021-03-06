import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class PhraseOMaticFileLesen {

    private static List<String> liesWoerterAusDatei(String filename) throws IOException {
        // BufferedReader fuer File aufmachen, welches sich im Projekt an derselben Stelle findet wie die
        // Java-Klassen:
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        PhraseOMaticFileLesen.class.getClassLoader().
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
        // drei Wortgruppen erstellen, aus denen ausgew�hlt wird
        List<String> wortListeEins = liesWoerterAusDatei("wortliste1.txt");

        List<String> wortListeZwei = liesWoerterAusDatei("wortliste2.txt");

        List<String> wortListeDrei = liesWoerterAusDatei("wortliste3.txt");

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

