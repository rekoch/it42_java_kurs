/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */


import java.util.Arrays;
import java.util.List;

public class DotCom {
    private int [] zellorte;
    private int anzahltreffer = 0;

    public String prüfDich(String stringtipp) {

        int tipp = Integer.parseInt(stringtipp);
        String return_string = "Vorbei";

        for (int zelle : zellorte) {

            if (tipp == zelle){
                return_string = "Treffer";
                anzahltreffer++;
                break;
            }
        }

        if (anzahltreffer == zellorte.length) {
            return_string = "Versenkt";
        }
        System.out.println(return_string);
        return return_string;
    }


    public void setZellorte(int[] orte){

        zellorte = orte;
    }
}
