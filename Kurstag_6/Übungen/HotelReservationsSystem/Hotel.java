import java.util.HashMap;

public class Hotel {
    private HashMap<String, Room> roomList = new HashMap<String, Room>();
    private int price;
    private int maxSingleRooms = 5;
    private int maxDoubleRooms = 5;
    private boolean wantsSingleRoom = true;
    private boolean wantsSeaView = true;


    public static void main(String[] args) {
        Person person1 = new Person("Mischa", "Haenen", "haba@haba.ch", 1, 2, 3, false);
        Person person2 = new Person("Damian", "Jushinski", "Damian@Jushins.ki", 7, 99, 3, true);
        Person person3 = new Person("Daniel", "Jacksson", "Daniel@Jacks.son", 2, 4, 1, false);

        Hotel hotel = new Hotel();
        hotel.bookRoom(person1);
        hotel.bookRoom(person2);
        hotel.bookRoom(person3);
        hotel.showWhenRoomsAreFree();
    }

    private void bookRoom(Person person) {
        Room newRoom = new Room(wantsSingleRoom, 0, wantsSeaView, person);
        if (wantsSingleRoom) {
            if (maxSingleRooms >= (person.takeSomePeopleWithMe + 1)) {
                maxSingleRooms = maxSingleRooms - (person.takeSomePeopleWithMe + 1);
                newRoom.setBookedRooms((person.takeSomePeopleWithMe + 1));
                roomList.put(person.email, newRoom);
            } else {
                System.out.println("Es sind noch " + maxSingleRooms + " Einzelzimmer frei!");
            }
        } else {
            if (maxDoubleRooms >= (person.takeSomePeopleWithMe + 1)) {
                maxDoubleRooms = maxDoubleRooms - ((person.takeSomePeopleWithMe + 1) / 2);
                newRoom.setBookedRooms(((person.takeSomePeopleWithMe + 1) / 2));
                roomList.put(person.email, newRoom);
            } else {
                System.out.println("Es sind noch " + maxDoubleRooms + "Doppelzimmer frei!");
            }
        }

        if (person.takeSomePeopleWithMe > 0) {
            price = newRoom.getPrice() * (person.takeSomePeopleWithMe + 1);
        }
        showInventation(person, price);

    }

    private void showInventation(Person person, int price) {
        if (roomList.get(person.email).tempOwner.email == person.email) {
            System.out.println("Ihnen wurde ein Hotelzimmer gebucht:");
            System.out.println("Name: " + person.vorname + " " + person.name);
            System.out.println("Email: " + person.email);
            System.out.println("Anzahl gebuchte Zimmer: " + roomList.get(person.email).bookedRooms);
            System.out.println("Preis: " + price);
            System.out.println("Dauer: " + person.checkIn + " bis " + person.checkOut);
        } else {
            System.out.println("Wir konnten leider keine Reservation für Sie vornehmen.");
        }

    }

    private void showWhenRoomsAreFree() {
        System.out.println("Anzahl freien Einzelzimmer: " + maxSingleRooms);
        System.out.println("Anzahl freien Doppelzimmer: " + maxDoubleRooms);
        System.out.println("Gebuchte Zimmer:");
        for (Room room : roomList.values()) {
            System.out.println("Zimmer von " + room.tempOwner.vorname + " " + room.tempOwner.name + "ist von" + room.tempOwner.checkIn + " bis " + room.tempOwner.checkOut + " gebucht.");
        }
    }

}
