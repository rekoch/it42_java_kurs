package Waffen;

public class Waffen{



    // Enthält ein von den beidnen Nah oder Fernkampfwaffen (Schwert oder Bogen) für die erste Waffe
    private int angriffswert;



    // nur Nahkampfwaffen haben einen Verteidigungswert
    private int verteidigungswert;


    private  int gewicht;




    public int getAngriffswert() {
        return angriffswert;
    }

    public void setAngriffswert(int angriffswert) {
        this.angriffswert = angriffswert;
    }




    public int getGewicht() {
        return gewicht;
    }

    public void setGewicht(int gewicht) {
       this.gewicht = gewicht;
    }

    public int getVerteidigungswert() {
        return verteidigungswert;
    }

    public void setVerteidigungswert(int verteidigungswert) {
       this.verteidigungswert = verteidigungswert;
    }



}
