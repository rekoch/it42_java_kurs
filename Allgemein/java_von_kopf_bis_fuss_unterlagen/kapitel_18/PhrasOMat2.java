package kapitel_18;

public class PhrasOMat2 {
   public static String phraseMachen() {

	// drei Wortgruppen erstellen, aus denen ausgew�hlt wird
    String[] wortListeEins = {"24/7","Multi-Tier","Enterprise","B2B","erfolgsorientierte","Frontend", "webbasierte","allumfassende", "klevere", "fulltime","pfadkritische", "dynamische"};

   String[] wortListeZwei = {"gepowerte", "haftende", "mehrwert", "orientierte", "zentrierte", "verteilte", "geclusterte", "Off-the-Shelft","Out-of-the-Box", "positionierte", "vernetzte", "fokusierte", "kraftvolle", "geordnete", "zielgerichtete", "geteilte", "kooperative", "beschleunigte"};

   String[] wortListeDrei = {"Schicht", "Endstufe", "L�sung", "Architektur", "Kernkompetenz", "Strategie", "Kooperation", "Kundenorientierung", "Raumlichkeit", "Vision", "�Dimension", "Mission"};

   // ermitteln, wie viele Worte sich in jeder Liste befinden
  int einsL�nge = wortListeEins.length;
  int zweiL�nge = wortListeZwei.length;
  int dreiL�nge = wortListeDrei.length;

  // drei Zufallszahlen generieren, um W�rter aus den Listen herauszuziehen
  int zufall1 = (int) (Math.random() * einsL�nge);
  int zufall2 = (int) (Math.random() * zweiL�nge);
  int zufall3 = (int) (Math.random() * dreiL�nge);

  // eine Phrase zusammenbauen
  String phrase = wortListeEins[zufall1] + " " + wortListeZwei[zufall2] + " " + wortListeDrei[zufall3];

  // eine Phrase ausgeben
  return ("Was wir brauchen, ist eine " + phrase);
  } 
}   

