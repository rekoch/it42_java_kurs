import java.util.ArrayList;
import java.util.List;

public class Hotel {
    List<Zimmer> zimmer = new ArrayList<>();

    public Hotel(){
        zimmer.add(new Zimmer(2,15.0f));
        zimmer.add(new Zimmer(1,99.0f));
        zimmer.add(new Zimmer(2,17.50f));
    }

    public void reserviereZimmer(int platze){
        for(int i = 0; i < zimmer.size(); i++){
            if(zimmer.get(i).getPlaetze() == platze){
                    zimmer.get(i).zimmerReservieren();
                    return;
            }
        }
    }
}
