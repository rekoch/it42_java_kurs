package waffen;

import java.util.ArrayList;

public class Waffen {
    int angriffsWert;
    int gewicht;
    ArrayList<Waffen> waffen = new ArrayList<Waffen>();

    public Waffen(int angriffsWert){
        this.angriffsWert = angriffsWert;
    }

    public int getKampfwert(){
        return (int)(angriffsWert);
    }
}


