/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private List<Zimmer> rooms = new ArrayList<>();
    private int freeRooms = 0;

    public int getFreeRooms() {
        for (Zimmer zimmer : rooms) {
            if (!zimmer.isReserviert()) {
                freeRooms++;
            }
        }
        return freeRooms;
    }
}
