package ch.sbb.it42.projektverwaltung;

public class Main {

    public static void main(String[] args) {

        Projekt hausBauen = new Projekt("Haus bauen");

        // Projekt "Haus bauen" besteht aus
        Task landKaufen = new Task("Land kaufen", 20);
        Task bewilligungEinholen = new Task("Baubewilligung einholen", 90);
        Projekt fundamentBilden = new Projekt("Fundament bilden");
        Projekt rohbauErstellen = new Projekt("Rohbau erstellen");
        Projekt dachDecken = new Projekt("Dach decken");
        Projekt feinschliffErledigen = new Projekt("Feinschliff erledigen");

        // Projekt "Fundament bilden" besteht aus
        Task baggerOrganisieren = new Task("Bagger organisieren", 2);
        Task kellerAusheben = new Task("Keller ausheben", 1.5);
        Task betonKaufen = new Task("Beton kaufen", 1);
        Task fundamentGiessen = new Task("Fundament giessen", 7);

        // Projekt "Rohbau erstellen" besteht aus
        Task erstenStockErstellen = new Task("Ersten Stock erstellen", 10);
        Task zweitenStockErstellen = new Task("Zweiten Stock erstellen", 10);
        Projekt stromAnschliessen = new Projekt("Strom anschliessen");
        Task wasserAnschliessen = new Task("Wasser anschliessen", 3.14);

        // Projekt "Dach decken" besteht aus
        Task ziegelWaehlen = new Task("Ziegel waehlen", 0.001);
        Task ziegelKaufen = new Task("Ziegel kaufen", 2);
        Projekt dachDeckenLassen = new Projekt("Dach decken lassen");

        // Projekt "Feinschliff erledigen" besteht aus
        Task fensterMontieren = new Task("Fenster montieren", 3);
        Task fassadeMalen = new Task("Fassade malen", 3);
        Task tuereEinsetzen= new Task("Tuere einsetzen", 0.25);


        // Projekt "Strom anschliessen" besteht aus
        Task elektrikerAufbieten = new Task("Elektriker aufbieten", 2);
        Task zimmerVerkabeln = new Task("Zimmer verkabeln", 3);
        Task blitzableiterInstallieren = new Task("Blitzableiter installieren", 2);

        // Projekt "Dach decken lassen" besteht aus
        Task dachdeckerBestellen = new Task("Dachdecker bestellen", 0.5);
        Task dachdeckerArbeitenLassen = new Task("Dachdecker arbeiten lassen", 21);
        Task dachdeckerZahlen = new Task("Dachdecker bezahlen", 0.1);

        hausBauen.add(landKaufen);
        hausBauen.add(bewilligungEinholen);
        hausBauen.add(fundamentBilden);
        hausBauen.add(rohbauErstellen);
        hausBauen.add(dachDecken);
        hausBauen.add(feinschliffErledigen);

        fundamentBilden.add(baggerOrganisieren);
        fundamentBilden.add(kellerAusheben);
        fundamentBilden.add(betonKaufen);
        fundamentBilden.add(fundamentGiessen);

        rohbauErstellen.add(erstenStockErstellen);
        rohbauErstellen.add(zweitenStockErstellen);
        rohbauErstellen.add(stromAnschliessen);
        rohbauErstellen.add(wasserAnschliessen);

        stromAnschliessen.add(elektrikerAufbieten);
        stromAnschliessen.add(zimmerVerkabeln);
        stromAnschliessen.add(blitzableiterInstallieren);

        dachDecken.add(ziegelWaehlen);
        dachDecken.add(ziegelKaufen);
        dachDecken.add(dachDeckenLassen);

        dachDeckenLassen.add(dachdeckerBestellen);
        dachDeckenLassen.add(dachdeckerArbeitenLassen);
        dachDeckenLassen.add(dachdeckerZahlen);

        feinschliffErledigen.add(fensterMontieren);
        feinschliffErledigen.add(fassadeMalen);
        feinschliffErledigen.add(tuereEinsetzen);

        System.out.println("Das Gesamtprojekt dauert: " + hausBauen.getGesamtDauer() + " Tage\n");

        System.out.println("Es besteht aus den folgenden Aufgaben:\n\n" + hausBauen.getPlan(""));
    }
}
