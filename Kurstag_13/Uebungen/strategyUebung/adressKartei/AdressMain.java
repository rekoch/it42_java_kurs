package adressKartei;

public class AdressMain {
    public static void main(String[] args) {
        AdressKartei ak = new AdressKartei();

        Adresse adresse1 = new Adresse(3612,"Steffisburg", "somewhere", "Alfred");
        ak.addAdresse(adresse1);
        Adresse adresse2 = new Adresse(3000,"Bern", "inBern", "Alfred");
        ak.addAdresse(adresse2);
        Adresse adresse3 = new Adresse(3600,"Thun", "inThun", "Benjamin");
        ak.addAdresse(adresse3);
        ak.suche(new SucheStrasse("inbern")).forEach(a -> System.out.println(a.toString()));
    }
}
