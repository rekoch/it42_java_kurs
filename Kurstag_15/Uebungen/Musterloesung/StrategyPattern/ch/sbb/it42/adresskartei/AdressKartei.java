package ch.sbb.it42.adresskartei;

import java.util.ArrayList;
import java.util.List;

public class AdressKartei {

    private List<Adresse> adressen = new ArrayList<>();

    public void add(Adresse adresse) {
        adressen.add(adresse);
    }

    public List<Adresse> suche(SuchKriterium suchkriterium) {
        List<Adresse> gefundeneAdressen = new ArrayList<>();
        for (Adresse adresse : adressen) {
            if (suchkriterium.istGesucht(adresse)) {
                gefundeneAdressen.add(adresse);
            }
        }
        return gefundeneAdressen;
    }
}
