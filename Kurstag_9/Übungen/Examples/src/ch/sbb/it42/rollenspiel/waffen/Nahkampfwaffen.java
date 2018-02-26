package Kurstag_9.Übungen.Examples.src.ch.sbb.it42.rollenspiel.waffen;

public class Nahkampfwaffen extends Waffen {

    private int verteidigungswert;

    public Nahkampfwaffen(int angriffswert, int kampfwert, int verteidigungswert) {
        super(angriffswert, kampfwert);
        this.verteidigungswert = verteidigungswert;
    }

    /**
     * Nur Nahkampfwaffen:
     * Angriffswert + (Verteidigungswert / 2)
     * @return Kampfwert der Waffe
     */
    public int getKampfwert(){
    }
}
