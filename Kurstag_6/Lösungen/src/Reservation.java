import java.util.Date;

public class Reservation {
    Date von;
    Date bis;
    String name;

    public Reservation(Date von, Date bis, String name){
        this.von = von;
        this.bis = bis;
        this.name = name;
    }
}
