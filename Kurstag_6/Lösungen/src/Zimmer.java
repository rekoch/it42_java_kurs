import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Zimmer {
    private int plaetze;
    private float preis;
    private List<Reservation> reservation = new ArrayList<>();

    public Zimmer(int plaetze, float preis){
        this.plaetze = plaetze;
        this.preis = preis;
    }

    public void zimmerReservieren(Date von, Date bis, String name){
        reservation.add(new Reservation(von,bis,name));
    }

    public int getPlaetze() {
        return plaetze;
    }

    public float getPreis() {
        return preis;
    }

    public void setPreis(float preis) {
        this.preis = preis;
    }
}
