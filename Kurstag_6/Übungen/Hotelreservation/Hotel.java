package Hotelreservation;

import java.util.List;
import java.util.ArrayList;

public class Hotel {
    List <Zimmer> zimmer = new ArrayList <>();

    public Hotel (){
        zimmer.add(new Zimmer(2,120.0f,false));
        zimmer.add(new Zimmer(1,150.0f,false));
        zimmer.add(new Zimmer(2,120.0f,false));
        zimmer.add(new Zimmer(1,150.0f,false));
        zimmer.add(new Zimmer(2,120.0f,false));
        zimmer.add(new Zimmer(1,150.0f,false));

    }
 public void reserviereZimmer(int anzahlbetten){
        for(int i = 0; 1< zimmer.size(); i++){
            if(zimmer.get(i).getAnzahlBetten() == anzahlbetten){
                zimmer.get(i).setBesetzt(true);
            }
        }
 }
}
