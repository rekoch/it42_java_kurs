package spielfiguren;

import Waffen.Waffen;

public class Spielfiguren extends Waffen{
    private String name;
    private double lebensPunkte;
    private int tragKraft;


    public Spielfiguren(String name, double lebensPunkte, int tragKraft) {
        this.name = name;
        this.lebensPunkte = lebensPunkte;
        this.tragKraft = tragKraft;

    }




    public int getTragKraft() {
        return tragKraft;
    }

    public void setTragKraft(int tragKraft) {
        this.tragKraft = tragKraft;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLebensPunkte() {
        return lebensPunkte;
    }

    public void setLebensPunkte(double lebensPunkte) {
        this.lebensPunkte = lebensPunkte;
    }


}
