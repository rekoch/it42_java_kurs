package Kurstag_9.Übungen.Examples.src.ch.sbb.it42.rollenspiel.spielfiguren;

public class Spielfigur {

    private String name;

    private double lebenspunkte;

    private int tragkraft;

    public Spielfigur(String name) {
        this.name = name;
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
}
