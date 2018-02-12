public class Einzelzimmer {
    private int preis;
    private boolean istBelegt;
    private int zimmerNr;

   // Gast gast = new Gast();

    public void reservieren(){
        //...Code.....
        System.out.println("Einzelzimmer wurde gebucht!");
        istBelegt = true;
       // return true;
    }

    public void checkout(){
        //...Code.....
        System.out.println("Einzelzimmer wurde ausgecheckt");
        istBelegt = false;
        //return false;
    }

    public boolean istBesetzt(){

        return istBelegt;
    }

}
