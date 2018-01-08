package kapitel_06;

// Tiger version

import java.io.*;
import java.util.*;

class SpielHelfer {

  private static final String alphabet = "abcdefg";
  private int rasterL�nge = 7;
  private int rasterGr��e = 49;
  private int [] raster = new int[rasterGr��e];
  private int dotComAnzahl = 0;


  public String getBenutzereingabe(String prompt) {
     String eingabeZeile = null;
     System.out.print(prompt + "  ");
     try {
       BufferedReader is = new BufferedReader(
	 new InputStreamReader(System.in));
       eingabeZeile = is.readLine();
       if (eingabeZeile.length() == 0 )  return null; 
     } catch (IOException e) {
       System.out.println("IOException: " + e);
     }
     return eingabeZeile.toLowerCase();
  }

  
  
 public ArrayList<String> platziereDotCom(int dotComGr��e) {                 // Zeile 19
    ArrayList<String> alphaZellen = new ArrayList<String>();
    String [] alphaKoordinaten = new String [dotComGr��e];      // enth�lt Koordinaten der Form 'f6'
    String temp = null;                                // tempor�rer String f�r concat
    int [] koordinaten = new int[dotComGr��e];                  // aktuelle Koordinatenkanidaten
    int versuche = 0;                                  // aktuelle Versuchsz�hler
    boolean erfolg = false;                           // schalter = einen guten Ort gefunden?
    int ort = 0;                                  // aktuelle Startposition
    
    dotComAnzahl++;                                        // n-tes zu platzierendes DotCom
    int inkrement = 1;                                      // horizontales Inkrement setzen
    if ((dotComAnzahl % 2) == 1) {                         // wenn ungerades DotCom  (vertikal platzieren)
      inkrement = rasterL�nge;                               // vertikales Inkrement setzen
    }

    while ( !erfolg & versuche++ < 200 ) {             // Haupt-Suchschleife (32)
	ort = (int) (Math.random() * rasterGr��e);      // zuf�lligen Startpunkt holen
        //System.out.print(" Versuche " + ort);
	int x = 0;                                        // n-te Position in zu platzierendem DotCom
        erfolg = true;                                 // von Erfolg ausgehen
        while (erfolg && x < dotComGr��e) {                // nach angrenzenden freien Stelle suchen
          if (raster[ort] == 0) {                    // wenn noch nicht benutzt
             koordinaten[x++] = ort;                    // Ort speichern
             ort += inkrement;                          // 'n�chste' angrenzende Zelle versuchen
             if (ort >= rasterGr��e){                 // au�erhalb der Grenzen - 'Ende'
               erfolg = false;                         // Fehlschlag
             }
             if (x>0 & (ort % rasterL�nge == 0)) {  // au�erhalb der Grenzen - rechter Rand
               erfolg = false;                         // Fehlschlag
             }
          } else {                                      // bereits belegter Ort gefunden
              // System.out.print(" verwendet " + ort);  
              erfolg = false;                          // Fehlschlag
          }
        }
    }                                                   // while-Ende

    int x = 0;                                          // den guten Ort in alphabetische Koordinaten umwandeln
    int zeile = 0;
    int spalte = 0;
    // System.out.println("\n");
    while (x < dotComGr��e) {
      raster[koordinaten[x]] = 1;                              // die Punkte im Referenzraster als 'verwendet' markieren
      zeile = (int) (koordinaten[x] / rasterL�nge);             // Zeilenwert holen
      spalte = koordinaten[x] % rasterL�nge;                  // numerischen Spaltenwert holen
      temp = String.valueOf(alphabet.charAt(spalte));   // in alphabetisches Zeichen umwandeln
      
      alphaZellen.add(temp.concat(Integer.toString(zeile)));
      x++;

      // System.out.print("  Koordinaten "+x+" = " + alphaZellen.get(x-1));
      
    }
    // System.out.println("\n");
    
    return alphaZellen;
   }
}