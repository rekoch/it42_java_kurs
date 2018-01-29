/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2017.
 */

package ch.sbb.shoppinglist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShoppingList {

    private String[] availableProducts;
    //Damit in dieser Array-Liste nur Objekte gespeichert werden können. Normalerweise gibt man eigentlich an was für ein Objekt es sein muss. In unserem Fall wäre das Duebel.
    private List<Duebel> productList = new ArrayList<>();
    private boolean erstesProdukt = true;

    //TODO: Siehe auch bei der main-Klasse. Irgendwie wird der Code nicht ausgeführt. Wieso?
    public void startShoppApp() {
        getAllAvailableProducts();
        Scanner scanner = new Scanner(System.in);

        while (addNewProducts(scanner)){}

        //TODO: die Ausgabe der Produkte ist aktuell unschön. Verbessere das. Es gibt diverse Ansätze dafür.
        System.out.println("Du hast folgende Produkte hinzugefügt: ");
        for (Duebel product : productList){
            System.out.println(product.getName());
        }

        //TODO: kannst du allenfalls das Programm so erweitern, dass der Benuzter die Anzahl anpassen kann? Oder vielleicht doch wieder Produkte hinzufügen kann?
    }

    private boolean addNewProducts(Scanner scanner) {
        if(erstesProdukt) {
            System.out.println("Herzlich Willkommen zu dieser innovativen und ewig lebender Shopping Liste. Basierend auf der einzigartigen Konsole.");
            erstesProdukt = false;
        }
        System.out.println("Welches Produkt möchtest du der Einkaufsliste hinzufügen? Gib die Produktnummer eines aus der Liste üblicher Produkte aus.");

        for (int i = 0; i < availableProducts.length; i++) {
            System.out.println("Produktnummer: " + i + " Produktname: " + availableProducts[i]);
        }
        int userProductInput = scanner.nextInt();

        switch (userProductInput) {
            //TODO: momentan ist diese Variante sehr fehleranfällig. Ändert sich die Produktliste, stimmen die Zahlen nicht mehr. Kennst du ein Konzept, das zu verbessern?
            case 0:
                if(availableProducts[0] == "Dübel") {
                    productList.add(new Duebel("Dübel", 1, 10));
                }
                else{
                    System.out.println("Leider haben wir im Moment ein Problem mit unserer Datenbank. Bitte kontaktieren sie den Besitzer");
                }
                break;
                //TODO: erstelle eine korrekte Klasse für 'Sicherung'
            case 1:
                if(availableProducts[1] == "Sicherung") {
                    productList.add(new Duebel("Sicherung", 1, 10));
                }
                else{
                    System.out.println("Leider haben wir im Moment ein Problem mit unserer Datenbank. Bitte kontaktieren sie den Besitzer");
                }
                break;
            //TODO: erstelle eine korrekte Klasse für 'Light Saber'
            case 2:
                if(availableProducts[2] == "Light Saber") {
                    productList.add(new Duebel("Light Saber", 1, 10));
                }
                else{
                    System.out.println("Leider haben wir im Moment ein Problem mit unserer Datenbank. Bitte kontaktieren sie den Besitzer");
                }
                break;
            //TODO: erstelle eine korrekte Klasse für 'Mikroskop'
            case 3:
                if(availableProducts[3] == "Mikroskop") {
                    productList.add(new Duebel("Mikroskop", 1, 10));
                }
                else{
                    System.out.println("Leider haben wir im Moment ein Problem mit unserer Datenbank. Bitte kontaktieren sie den Besitzer");
                }
                break;
            //TODO: erstelle eine korrekte Klasse für 'RAM'
            case 4:
                if(availableProducts[3] == "RAM") {
                    productList.add(new Duebel("RAM", 1, 10));
                }
                else{
                    System.out.println("Leider haben wir im Moment ein Problem mit unserer Datenbank. Bitte kontaktieren sie den Besitzer");
                }
                break;
            default:
                System.out.println("deine gewählte Zahl entspricht keinem Produkt. Versuchs nochmal");
        }
        System.out.println("Weitere Produkte hinzufügen? Gib 'n' ein zum abbrechen oder 'j' zum weitermachen.");
        String userInput = scanner.next();

        if (userInput.equalsIgnoreCase("n")){
            return false;
        } else {
            return true;
        }
    }

    private void getAllAvailableProducts() {
        //TODO: schreibe die Zuweisung der Werte kürzer
        availableProducts = new String[5];

        availableProducts[0] = "Dübel";
        availableProducts[1] = "Sicherung";
        availableProducts[2] = "Light Saber";
        availableProducts[3] = "Mikroskop";
        availableProducts[4] = "RAM";
    }

}
