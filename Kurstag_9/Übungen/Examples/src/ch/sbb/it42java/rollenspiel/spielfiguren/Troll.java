package spielfiguren;

import waffen.Keule;
import waffen.Waffen;

public class Troll extends Spielfiguren {
    public Troll(String name){
        super(name);
    }

    public void spielfigurGetWaffe(Waffen waffe) {
        if (waffe instanceof Keule){
            tragkraft += 5;
        }
        waffen.add(waffe);
    }
}
