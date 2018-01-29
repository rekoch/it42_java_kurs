/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    List<Zimmer> zimmer = new ArrayList<>();

    public Hotel(){
        zimmer.add(new Zimmer(2, 25.50));
        zimmer.add(new Zimmer(2, 35.50));
        zimmer.add(new Zimmer(2, 45.50));
        zimmer.add(new Zimmer(2, 55.50));
        zimmer.add(new Zimmer(2, 65.50));
        zimmer.add(new Zimmer(1, 12.50));
        zimmer.add(new Zimmer(1, 13.50));
        zimmer.add(new Zimmer(1, 14.50));
        zimmer.add(new Zimmer(1, 15.50));
        zimmer.add(new Zimmer(1, 16.50));
        zimmer.add(new Zimmer(1, 17.50));
    }
}
