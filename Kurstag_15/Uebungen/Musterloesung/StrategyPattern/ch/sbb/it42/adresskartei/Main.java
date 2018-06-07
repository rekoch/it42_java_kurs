package ch.sbb.it42.adresskartei;


import ch.sbb.it42.adresskartei.suchkriterien.GeburtsjahrSuchKriterium;
import ch.sbb.it42.adresskartei.suchkriterien.KombiniertesSuchKriterium;
import ch.sbb.it42.adresskartei.suchkriterien.NachnamenSuchKriterium;

import java.util.List;

public class Main {


    public static void main(String[] args) {
        AdressKartei adressKartei = new AdressKartei();

        Adresse adresse1 = new Adresse("Sybille", "Meyer", 3000, "Bern", 1990);
        Adresse adresse2 = new Adresse("Andreas", "Huber", 2503, "Biel", 1988, "Fussball-Fan", "Ferrari-Fahrer", "hat 8 Kinder");
        Adresse adresse3 = new Adresse("Hansueli", "Kohl", 3600, "Thun", 2001);
        Adresse adresse4 = new Adresse("Susanne", "Meyer", 3600, "Chur", 1988, "liest Krimis");

        adressKartei.add(adresse1);
        adressKartei.add(adresse2);
        adressKartei.add(adresse3);
        adressKartei.add(adresse4);

        // Suche nach Nachnamen:
        List<Adresse> resultat1 = adressKartei.suche(new NachnamenSuchKriterium("   Meyer"));
        gibResultatAus(resultat1);

        // Suche nach Alter
        List<Adresse> resultat2 = adressKartei.suche(new GeburtsjahrSuchKriterium(2001));
        gibResultatAus(resultat2);

        // Suche nach Alter UND Nachnamen:
        List<Adresse> resultat3 = adressKartei.suche(new KombiniertesSuchKriterium(new NachnamenSuchKriterium("Meyer "), new GeburtsjahrSuchKriterium(1988)));
        gibResultatAus(resultat3);
    }


    public static void gibResultatAus(List<Adresse> resultat) {
        System.out.println();
        System.out.println("Gefundene Adressen: ");
        for (Adresse a : resultat) {
            System.out.println("   " + a);
        }
    }

}
