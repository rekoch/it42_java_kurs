/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2017.
 */

package ch.sbb.shoppinglist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ShoppingList {

    private String[] availableProducts;
    //Damit man es einfacher ausgeben kann
    private List<Object> productList = new ArrayList<>();

    //Muss noch bei main eingefügt werden
    public void startShoppApp() {
        System.out.println("Herzlich Willkommen zu dieser innovativen und ewig lebender Shopping Liste. Basierend auf der einzigartigen Konsole.");
        getAllAvailableProducts();
        Scanner scanner = new Scanner(System.in);

        while (addNewProducts(scanner)){}

        int preisGesamt = 0;
        int preisRAM = 0;
        int preisDuebel = 0;
        int preisMikroskop = 0;
        int preisSicherung = 0;
        int preisLightSaber = 0;

        System.out.println("Du hast folgende Produkte hinzugefuegt: ");

        for (Object product : productList){
            preisGesamt = preisGesamt + listProducts(product, preisDuebel, preisMikroskop, preisRAM, preisSicherung, preisLightSaber);
        }

        System.out.println("----------------------------------");
        System.out.println("Gesamtkosten: " + preisGesamt);

        System.out.println("Moechten sie weitere Produkte hinzufuegen? ");
        String userInput = scanner.next();
        userInput = userInput.toUpperCase();

        if (userInput.startsWith("J")){
            while (addNewProducts(scanner)) {}

            System.out.println("Du hast folgende Produkte hinzugefuegt: ");

            for (Object product : productList){
                preisGesamt = preisGesamt + listProducts(product, preisDuebel, preisMikroskop, preisRAM, preisSicherung, preisLightSaber);
            }

            System.out.println("----------------------------------");
            System.out.println("Gesamtkosten: " + preisGesamt);

            System.out.println("\nDanke fuer ihren Einkauf!");
        } else {
            System.out.println("\nDanke fuer ihren Einkauf!");
        }

    }

    private int listProducts(Object product, int preisDuebel, int preisMikroskop, int preisRAM, int preisSicherung, int preisLightSaber)
    {
        if (product instanceof Duebel)
        {
            Duebel duebel = (Duebel) product;
            preisDuebel = preisDuebel + (duebel.getPreis() * duebel.getAnzahl());
            System.out.println("Duebel, Anzahl: " + duebel.getAnzahl() + ", Preis: " + preisDuebel);
            return preisDuebel;
        }

        else if (product instanceof Mikroskop)
        {
            Mikroskop mikroskop = (Mikroskop) product;
            preisMikroskop = preisMikroskop + (mikroskop.getPreis() * mikroskop.getAnzahl());
            System.out.println("Mikroskop, Anzahl: " + mikroskop.getAnzahl() + ", Preis: " + preisMikroskop);
            return preisMikroskop;
        }

        else if (product instanceof Sicherung)
        {
            Sicherung sicherung = (Sicherung) product;
            preisSicherung = preisSicherung + (sicherung.getPreis() * sicherung.getAnzahl());
            System.out.println("Sicherung, Anzahl: " + sicherung.getAnzahl() + ", Preis: " + preisSicherung);
            return preisSicherung;
        }

        else if (product instanceof Light_Saber)
        {
            Light_Saber light_Saber = (Light_Saber) product;
            preisLightSaber = preisLightSaber + (light_Saber.getPreis() * light_Saber.getAnzahl());
            System.out.println("Light Saber, Anzahl: " + light_Saber.getAnzahl() + ", Preis: " + preisLightSaber);
            return preisLightSaber;
        }

        else if (product instanceof RAM)
        {
            RAM RAM = (RAM) product;
            preisRAM =  preisRAM + (RAM.getPreis() * RAM.getAnzahl());
            System.out.println("RAM, Anzahl: " + RAM.getAnzahl() + ", Preis: " + preisRAM);
            return preisRAM;
        }

        return 0;
    }

    private boolean addNewProducts(Scanner scanner) {

        System.out.println("Welches Produkt moechtest du der Einkaufsliste hinzufuegen? Gib die Produktnummer eines aus der Liste üblicher Produkte aus.");

        for (int i = 0; i < availableProducts.length; i++) {
            System.out.println("Produktnummer: " + i + " Produktname: " + availableProducts[i]);
        }
        int userProductInput = scanner.nextInt();
        System.out.println("Wie viele Produkte dieser Art willst du einkaufen?");
        int anzahl = scanner.nextInt();

        switch (userProductInput) {
            //TODO: momentan ist diese Variante sehr fehleranfällig. Ändert sich die Produktliste, stimmen die Zahlen nicht mehr. Kennst du ein Konzept, das zu verbessern?
            case 0:
                productList.add(new Duebel(anzahl));
                break;
            case 1:
                productList.add(new Sicherung(anzahl));
                break;
            case 2:
                productList.add(new Light_Saber(anzahl));
                break;
            case 3:
                productList.add(new Mikroskop(anzahl));
                break;
            case 4:
                productList.add(new RAM(anzahl));
                break;
            default:
                System.out.println("Deine gewählte Zahl entspricht keinem Produkt. Versuchs nochmal");
        }
        System.out.println("Weitere Produkte hinzufuegen? Gib 'n' ein zum abbrechen oder 'j' zum weitermachen.");
        String userInput = scanner.next();
        userInput = userInput.toUpperCase();

        if (userInput.startsWith("N")){
            return false;
        } else {
            return true;
        }
    }

    private void getAllAvailableProducts() {
        availableProducts = new String[] {"Duebel", "Sicherung", "Light Saber", "Mikroskop", "RAM"};
    }

}
