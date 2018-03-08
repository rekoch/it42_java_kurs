package kapitel_01;

public class PhraseOMatic {
   public static void main (String[] args) {

   // drei Wortgruppen erstellen, aus denen ausgew�hlt wird
   String[] wortListeEins = {"24/7","Multi-Tier","Enterprise","B2B","erfolgsorientierte","Frontend", "webbasierte","allumfassende", "klevere", "fulltime","pfadkritische", "dynamische"};

   String[] wortListeZwei = {"gepowerte", "haftende", "mehrwert", "orientierte", "zentrierte", "verteilte", "geclusterte", "Off-the-Shelft","Out-of-the-Box", "positionierte", "vernetzte", "fokusierte", "kraftvolle", "geordnete", "zielgerichtete", "geteilte", "kooperative", "beschleunigte"};

   String[] wortListeDrei = {"Schicht", "Endstufe", "L�sung", "Architektur", "Kernkompetenz", "Strategie", "Kooperation", "Kundenorientierung", "Raumlichkeit", "Vision", "�Dimension", "Mission"};

  // ermitteln, wie viele Worte sich in jeder Liste befinden
  int einsL�nge = wortListeEins.length;
  int zweiL�nge = wortListeZwei.length;
  int dreiL�nge = wortListeDrei.length;

  // drei Zufallszahlen generieren, um W�rter aus den Listen herauszuziehen
  int rand1 = (int) (Math.random() * einsL�nge);
  int rand2 = (int) (Math.random() * zweiL�nge);
  int rand3 = (int) (Math.random() * dreiL�nge);

  // eine Phrase zusammenbauen
  String phrase = wortListeEins[rand1] + " " + wortListeZwei[rand2] + " " + wortListeDrei[rand3];

  // eine Phrase ausgeben
  System.out.println("Was wir brauchen ist ein " + phrase);
  } 
}   

