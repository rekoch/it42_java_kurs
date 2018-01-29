/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

import java.util.Date;

public class Reservation {
    private Date reserviertVon;
    private Date reserviertBis;
    private String kunde;

    public Reservation(Date reserviertVon, Date reserviertBis, String kunde){
        this.reserviertVon = reserviertVon;
        this.reserviertBis = reserviertBis;
        this.kunde = kunde;
    }
}
