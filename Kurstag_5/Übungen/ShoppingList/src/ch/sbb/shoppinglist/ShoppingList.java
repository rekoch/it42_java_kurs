/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2017.
 */

package ch.sbb.shoppinglist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShoppingList {

    boolean ersterAufruf = true;

    private String[] availableProducts;
    //versuche zu begründen, wieso der Typ der Liste hier "Object" ist. Wir werden später lernen, wie man so was richtig macht.
    //Da die verschiedenen Produkte, welche zur Auswahl stehen alle verschiedene Objekte sind.
    private List<Object> productList = new ArrayList<>();

    //Er wurde gar nie aufgerufen. Ich habe deshalb "shoppingList.startShoppApp();" hinzugefügt im Main.java
    public void startShoppApp() {
        getAllAvailableProducts();
        Scanner scanner = new Scanner(System.in);

        //TODO: diese ganze Logik der While Schlaufe lässt sich eigentlich auf eine Zeile kürzen. Weisst du wie?
        boolean addingProducts = true;
        while (addingProducts) {
           addingProducts = addNewProducts(scanner);
        }

        System.out.println("Du hast folgende Produkte hinzugefügt: ");
        for (Object product : productList){
            System.out.println(product.getClass().getSimpleName());
            System.out.println(Duebel.anzahlAusgeben());
        }

        //TODO: kannst du allenfalls das Programm so erweitern, dass der Benuzter die Anzahl anpassen kann? Oder vielleicht doch wieder Produkte hinzufügen kann?
    }

    private boolean addNewProducts(Scanner scanner) {

        if (ersterAufruf){
            System.out.println("Herzlich Willkommen zu dieser innovativen und ewig lebender Shopping Liste. Basierend auf der einzigartigen Konsole.");
            System.out.println("Welches Produkt möchtest du der Einkaufsliste hinzufügen? Gib die Produktnummer eines aus der Liste üblicher Produkte aus.");
        }
        ersterAufruf = false;

        for (int i = 0; i < availableProducts.length; i++) {
            System.out.println("Produktnummer: " + i + " Produktname: " + availableProducts[i]);
        }
        int userProductInput = scanner.nextInt();

        switch (userProductInput) {
            //TODO: momentan ist diese Variante sehr fehleranfällig. Ändert sich die Produktliste, stimmen die Zahlen nicht mehr. Kennst du ein Konzept, das zu verbessern?
            case 0:
                //TODO: Preis und Anzahl spielen noch keine Rolle. Wie kannst du das richtig einbinden?
                productList.add(new Duebel(1, 10));
                break;
            case 1:
                productList.add(new Sicherung(1, 10));
                break;
            case 2:
                productList.add(new Light_Saber(1, 10));
                break;
            case 3:
                productList.add(new Mikroskop(1, 10));
                break;
            case 4:
                productList.add(new RAM(1, 10));
                break;
            default:
                System.out.println("deine gewählte Zahl entspricht keinem Produkt. Versuchs nochmal");
        }

        System.out.println("Anzahl:");
        String userInputAnzahl = scanner.next();

        if (Character.isDigit(Integer.parseInt(userInputAnzahl))){
            Duebel.anzahlÄndern(12);
            System.out.println();
        }
        else{
            System.out.println("Versuchs nochmal");
        }


        System.out.println("Weitere Produkte hinzufügen? Gib 'n' ein zum abbrechen oder 'j' zum weitermachen.");
        String userInput = scanner.next();

        if (userInput.toLowerCase().startsWith("n")){
            return false;
        } else {
            return true;
        }
    }

    private void getAllAvailableProducts() {
        availableProducts = new String[] {"Dübel", "Sicherung", "Light Saber", "Mikroskop", "RAM"};

    }

}
