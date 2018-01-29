public class Room {
    public boolean roomType;
    public boolean seaView;
    public int bookedRooms;
    public Person tempOwner;

    public Room(boolean roomType, int bookedRooms, boolean seaView, Person tempOwner) {
        this.roomType = roomType;
        this.bookedRooms = bookedRooms;
        this.seaView = seaView;
        this.tempOwner = tempOwner;
    }

    public int getPrice() {
        int priceTemp;
        if (roomType) {
            priceTemp = 200;

        } else {
            priceTemp = 400;
        }
        if (seaView) {
            priceTemp = +200;
        }

        return priceTemp;
    }

    public void setBookedRooms(int bookedRooms) {
        this.bookedRooms = bookedRooms;
    }
}
