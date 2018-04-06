/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package Waffen;

public class Nahkampfwaffe extends Waffe {
    private int verteidigungswert;

    @Override
    public int getWaffenKampfwert(){
        return super.getWaffenKampfwert()+verteidigungswert/2;
    }

    public int getVerteidigungswert() {
        return verteidigungswert;
    }

    public void setVerteidigungswert(int verteidigungswert) {
        this.verteidigungswert = verteidigungswert;
    }

}
