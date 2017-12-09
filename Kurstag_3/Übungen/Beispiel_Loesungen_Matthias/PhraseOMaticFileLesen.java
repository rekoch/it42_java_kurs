import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class PhraseOMaticFileLesen {

    private static List<String> liesWoerterAusDatei(String filename) throws IOException {
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
        int rand1 = (int) (Math.random() * einsLänge);
        int rand2 = (int) (Math.random() * zweiLänge);
        int rand3 = (int) (Math.random() * dreiLänge);

        // eine Phrase zusammenbauen
        String phrase = wortListeEins.get(rand1) + " " + wortListeZwei.get(rand2) + " " + wortListeDrei.get(rand3);

        // eine Phrase ausgeben
        System.out.println("Was wir brauchen ist eine " + phrase);
    }
}   

