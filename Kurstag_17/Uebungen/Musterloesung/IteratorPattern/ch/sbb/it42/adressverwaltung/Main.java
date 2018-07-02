package ch.sbb.it42.adressverwaltung;


import java.util.Iterator;

public class Main {


    public static void main(String[] args) {
        AdressVerwaltung adressVerwaltung = new AdressVerwaltung();

        Adresse adresse1 = new Adresse("Sybille", "Meyer", 3000, "Bern");
        Adresse adresse2 = new Adresse("Andreas", "Huber", 2503, "Biel");
        Adresse adresse3 = new Adresse("Hansueli", "Frisch", 3600, "Thun");
        Adresse adresse4 = new Adresse("Susanne", "Mueller", 8700, "Chur");

        adressVerwaltung.add(adresse1);
        adressVerwaltung.add(adresse2);
        adressVerwaltung.add(adresse3);
        adressVerwaltung.add(adresse4);

        System.out.println("Folgende Adressen sind jetzt in der AdressVerwaltung:");
        Iterator<Adresse> iterator = adressVerwaltung.createIterator();
        while (iterator.hasNext()) {
            Adresse adresse = iterator.next();
            System.out.println(adresse);
        }

        System.out.println("Entferne dritte Adresse via Iterator.remove:");
        iterator = adressVerwaltung.createIterator();
        int zaehler = 0;
        while (iterator.hasNext()) {
            zaehler++;
            if (zaehler == 3) {
                iterator.remove();
            }
        }

        System.out.println("Folgende Adressen sind jetzt in der AdressVerwaltung:");
        iterator = adressVerwaltung.createIterator();
        while (iterator.hasNext()) {
            Adresse adresse = iterator.next();
            System.out.println(adresse);
        }
    }
}
