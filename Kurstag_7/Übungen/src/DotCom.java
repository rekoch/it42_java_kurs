/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */


import java.util.Arrays;
import java.util.List;

public class DotCom {
    private int [] zellorte;
    private int anzahltreffer = 0;


    public DotCom(){
        this.zellorte = zellorte;
        this.anzahltreffer = anzahltreffer;
    }

    public String prüfDich(String tipp) {

        int tipp_int = Integer.parseInt(tipp);
        String return_string = "";

        for (int i = 0; i < zellorte.length; ++i)
        {
            List<int[]> zellorte_list = Arrays.asList(zellorte);  //konvertiert zellorte zu einer "List", damit compare funktioniert

            boolean treffer = zellorte_list.contains(tipp_int);

            if (treffer){
                anzahltreffer++;
                if (anzahltreffer <= 3){
                    return_string = "Versenkt";
                }
                else{
                    return_string  = "Treffer";
                }
            }
            else{
                return_string = "Vorbei";
            }
        }
        return return_string;
    }

    public void setZellorte(int[] orte){

        this.zellorte = orte;
    }
}
