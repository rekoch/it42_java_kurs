package spielfiguren;
import waffen.*;
import gegenstaende.*;

import java.util.ArrayList;


public class Spielfiguren {
    String name;
    double leben;
    int tragkraft;
    ArrayList<Waffen> waffen = new ArrayList<Waffen>();

    Keule keule = new Keule();

    public Spielfiguren(String name){
        this.name = name;
        waffen.add(keule);
    }

    public double getKampfwert(int slot){
        if(waffen.size() >= slot) {
            return waffen.get(slot).getKampfwert() * ((Math.random()) * 1.1 + 0.9);
        }
        else{
            System.out.print("Keine Waffe auf dem Slot");
            return 0;
        }
    }

    public void spielfigurGetWaffe(Waffen waffe){
        waffen.add(waffe);
    }
}
