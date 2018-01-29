public class Person {
    public String vorname;
    public String name;
    public String email;
    public int checkIn;
    public int checkOut;
    public int takeSomePeopleWithMe;
    public boolean payed;

    public Person(String vorname, String name, String email, int checkIn, int checkOut, int takeSomePeopleWithMe, boolean payed) {
        this.vorname = vorname;
        this.name = name;
        this.email = email;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.takeSomePeopleWithMe = takeSomePeopleWithMe;
        this.checkOut = checkOut;
        this.payed = payed;
    }
}
