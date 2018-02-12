public class Validator {

    public boolean istKorrekt;

    public void validierung(String zimmerWahl){

        if(zimmerWahl.contains("einzelzimmer1") || zimmerWahl.contains("einzelzimmer2") || zimmerWahl.contains("einzelzimmer3") || zimmerWahl.contains("einzelzimmer4") || zimmerWahl.contains("einzelzimmer5")){

            System.out.println("Alles Guet");
            istKorrekt = true;
        }
        else{
            System.out.println("Fehler");
            istKorrekt = false;
        }

    }
}
