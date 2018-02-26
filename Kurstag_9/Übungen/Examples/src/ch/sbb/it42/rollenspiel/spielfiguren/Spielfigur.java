package Kurstag_9.Übungen.Examples.src.ch.sbb.it42.rollenspiel.spielfiguren;

import Kurstag_9.Übungen.Examples.src.ch.sbb.it42.rollenspiel.gegenstaende.Gegenstaende;
import Kurstag_9.Übungen.Examples.src.ch.sbb.it42.rollenspiel.waffen.Keule;

public class Spielfigur {

    private String name;

    private double lebenspunkte;

    private int tragkraft;

    private Waffe aktiveWaffe;

    public Spielfigur(String name) {
        this.name = name;
        this.aktiveWaffe = new Keule();
    }

    /**
     * Gibt den Kampfwert der SPielfigur zurueck.
     * Der Kampfwert der Waffe wird mit einer Random-Nr. zwischen
     * 0.9 und 1.1 multipliziert.
     * @return Kampfwert der Spielfigur
     */
    public double getKampfwert(){

    }

    /**
     * Tragkraft muss ausreichen um mehrere Waffen zu tragen.
     * Es kann nur immer eine aktiv sein.
     * @return Hebt eine Waffe auf.
     */
    public Waffe waffeAufheben(){

    }


    /**
     *
     * @param gegenstand der Gegenstand der aufgehoben werden soll.
     * @return <code> true </code> wenn der Gegenstand aufgehoben wurde,
     * sonst <code> false </code>.
     */
    public boolean nehmeGegenstand(Gegenstaende gegenstand){

    }

    /**
     * Spielfiguren können im Kampf Gegenstände benutzen.
     * @return
     */
    public Gegenstände benutzen(){

    }

    /**
     * Lässt diese Spielfigur gegen eine andere kaempfen.
     * Gekaempft wird in Runden. Es wird solange gekaempft, bis eine oder beide
     * Spielfiguren keine Lebenspunkte mehr haben. Steht nach 20 Runden noch kein Sieger fest,
     * wird der Kampf abgebrochen.
     *
     * Bei jeder Runde wird der Kampfwert der einen Spielfigur den Lebenspunkten
     * des Gegners abgezogen  und umgekehrt.
     *
     * Diejenige Spielfigur mit den meisten verbliebenen Lebenspunkten gewinnt.
     *
     * @param gegner
     * @return
     */
    public boolean kaempfeGegen(Spielfigur gegner){

    }
}
