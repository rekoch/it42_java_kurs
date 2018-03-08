/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

public class Zimmer {
    private boolean singleRoom;
    private boolean reserviert;
    private int roomNumber;
    private int price;

    public Zimmer(boolean singleRoom, boolean reserviert, int roomNumber, int price) {
        this.singleRoom = singleRoom;
        this.reserviert = false;
        this.roomNumber = roomNumber;
        this.price = price;
    }

    public boolean isReserviert() {
        return reserviert;
    }

    public void setReserviert(boolean reserviert) {
        this.reserviert = reserviert;
    }

    public int getRoomNumber() {
        return roomNumber;
    }
}
