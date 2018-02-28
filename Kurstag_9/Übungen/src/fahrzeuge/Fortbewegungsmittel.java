/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

public class Fortbewegungsmittel {


    public static void main(String[] args) {
        Fortbewegungsmittel Privat = new Privat();
        Fortbewegungsmittel Öffentlich = new Öffentlich();
        Öffentlich Zug = new Zug();
        Öffentlich Bus = new Bus();
        Öffentlich Tram = new Tram();

        Privat LKW = new LKW();
        Privat Auto = new Auto();
        Privat Fahrrad = new Fahrrad();
    }

    int maxSpeed;

    public void fortbewegung (int maxspeed){

    }
}