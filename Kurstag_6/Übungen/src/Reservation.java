/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

import java.util.Date;

public class Reservation {
    private final Date von;
    private final Date bis;

    public Reservation(Date von, Date bis, String name){
        this.von = von;
        this.bis = bis;


    }
}
