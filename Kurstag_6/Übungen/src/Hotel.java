/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    List<Zimmer> zimmer = new ArrayList<>();

    public Hotel(){
        zimmer.add(new Zimmer(2,false,10.0f));
        zimmer.add(new Zimmer(1,false,10.0f));
        zimmer.add(new Zimmer(2,false,15.0f));
    }

    public void reserviereZimmer(int plaetze){
        for(int i = 0; i < zimmer.size(); i++){
            if(zimmer.get(i).getPlaetze() == plaetze) {
                zimmer.get(i).setBesetzt(true);

            }
        }
    }
}
