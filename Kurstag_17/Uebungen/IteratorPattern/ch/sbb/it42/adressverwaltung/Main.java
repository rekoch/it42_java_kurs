package ch.sbb.it42.adressverwaltung;

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
        //TODO: Iterator verwenden

        //TODO (Optional): Verwendung der Iterator.remove-Methode am Beispiel aufzeigen
    }
}
