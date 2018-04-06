/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package Spielfiguren;

public class Ork extends Spielfigur {
    private double startLeben;
    private int kampfrauschRunden = 0;

    public Ork(String name) {
        super(name);
        startLeben = getLeben();
    }

    @Override
    public void reduziereLeben(double schaden) {
        if(getLeben() < startLeben/4){
            kampfrauschRunden++;
            if (kampfrauschRunden > 3){
                super.reduziereLeben(schaden);
            } else {
                setLeben(getLeben() - schaden/2);
            }
        } else {
            super.reduziereLeben(schaden);
        }
    }

    @Override
    public double getSpielerKampfwert() {
        double kampfwert = super.getSpielerKampfwert();
        if (kampfrauschRunden > 0 &&kampfrauschRunden < 4){
            kampfwert *= 3;
        }
        return kampfwert;
    }
}
