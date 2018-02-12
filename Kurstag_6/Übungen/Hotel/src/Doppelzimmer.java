public class Doppelzimmer {
    private int preis;
    private boolean istFrei;
    private int zimmerNr;

    public boolean reservieren(boolean istFrei){
        //...Code.....
        System.out.println("Doppelzimmer wurde gebucht");
        return istFrei;
    }

    public boolean checkout(boolean istFrei){
        //...Code.....
        System.out.println("Doppelzimmer wurde ausgecheckt");
        return istFrei;
    }
}
