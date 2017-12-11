public class BananenRunner {

    //default Wert = false, weil ausserhalb Methode definiert
    static boolean ichbinTrue;

    public static void main(String[] args) {
        Banane banane1 = new Banane();
        Banane banane2 = new Banane();
        Banane banane3 = new Banane();
        Banane banane4 = new Banane();
        Banane banane5 = new Banane();
        Banane banane6 = new Banane();
        Banane banane7 = new Banane();
        Banane banane8 = new Banane();
        Banane banane9 = new Banane();
        Banane banane10 = new Banane();

        System.out.println(Banane.counter);
        System.out.println(banane1.counter);
        System.out.println(ichbinTrue);

        /*
        FRAGEN zu Variablen.pdf
        -----------------------------------------------------------------------------------
        Über welchen Weg musst du die Eigenschaft "counter" abfragen?
        -> Banane.counter

        Kannst du die Eigenschaft "counter" auch über das Objekt abfragen (bpsw. banane1.counter)?
        -> Ja

        Wieso kannst du dies bzw. wieso geht das nicht?
        Weil nun banane1 ein Objekt der Klasse Banane ist und somit die den counter auch auslesen kann
        */
    }
}