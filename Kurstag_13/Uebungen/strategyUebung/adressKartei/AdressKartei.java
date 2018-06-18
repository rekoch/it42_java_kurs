package adressKartei;

import java.util.ArrayList;
import java.util.List;

public class AdressKartei {
    List<Adresse> adressen = new ArrayList<>();


    public void addAdresse(Adresse adresse){
        adressen.add(adresse);
    }

    public List<Adresse> suche(Suchkriterium suchkriterium){
        List<Adresse> foundAdresses = new ArrayList<>();
        adressen.forEach(a -> {if(suchkriterium.istRelevant(a))foundAdresses.add(a);});
        return foundAdresses;
    }
}
