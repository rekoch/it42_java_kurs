import java.util.Scanner;

public class Benutzerschnittstelle {

    String zimmerWahl;
    Validator validator = new Validator();

    public void start(){
        //Wir haben 5 Einzel- sowie 5 Doppelzimmer.
        Einzelzimmer einzelzimmer1 = new Einzelzimmer();
        Einzelzimmer einzelzimmer2 = new Einzelzimmer();
        Einzelzimmer einzelzimmer3 = new Einzelzimmer();
        Einzelzimmer einzelzimmer4 = new Einzelzimmer();
        Einzelzimmer einzelzimmer5 = new Einzelzimmer();

        Doppelzimmer doppelzimmer1 = new Doppelzimmer();
        Doppelzimmer doppelzimmer2 = new Doppelzimmer();
        Doppelzimmer doppelzimmer3 = new Doppelzimmer();
        Doppelzimmer doppelzimmer4 = new Doppelzimmer();
        Doppelzimmer doppelzimmer5 = new Doppelzimmer();


        Gast gast1 = new Gast();
        Gast gast2 = new Gast();

        boolean programmlaeuft = true;

        Scanner scanner = new Scanner(System.in); //Für evtl. Auswahl

        do{
            System.out.println("Was möchten Sie gerne tun?");
            System.out.println("1. Zimmer reservieren/einchecken");
            System.out.println("2. Zimmer freigeben/auschecken");
            System.out.println("3. Zimmer abfragen");

            int auswahl = scanner.nextInt();
            if(auswahl == 1){
                System.out.println("Bitte geben Sie ein um welches Zimmer es sich handelt? (einzelzimmer1 / doppelzimmer3 / etc.)");
                zimmerWahl = scanner.next();
                validator.validierung(zimmerWahl);
                if(einzelzimmer1.istBesetzt() == false){
                    einzelzimmer1.reservieren();
                }
                else{
                    System.out.println("Dieses Zimmer ist bereits besetzt.");
                }
            }
            else if (auswahl == 2){
                if(einzelzimmer1.istBesetzt() == true){
                    einzelzimmer1.checkout();
                }
                else {
                    System.out.println("Dieser Zimmer ist bereits frei.");
                }
            }
            else if (auswahl == 3){
                //Reservierte abfragen
            }
            else{
                System.out.println("Bitte wählen Sie eine Auswahl zwischen 1-3");
            }

            System.out.println("Wollen Sie noch weiter machen? (j/n)");
            String weiter = scanner.next();
            if(weiter.equals("n") || weiter.equals("N")) {
                programmlaeuft = false;
            }

        }while(programmlaeuft);
    }
}
