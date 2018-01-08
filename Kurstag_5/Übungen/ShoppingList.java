/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2017.
 */

package ch.sbb.shoppinglist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShoppingList {

    private String[] availableProducts;
    //versuche zu begründen, wieso der Typ der Liste hier "Object" ist. Wir werden später lernen, wie man so was richtig macht.
    //weil es mehrere Objekte sind in der Liste
    private List<Object> productList;

    public ShoppingList() {
        productList = new ArrayList<Object>();
    }

    //Siehe auch bei der main-Klasse. Irgendwie wird der Code nicht ausgeführt. Wieso?
    public void startShopApp() {
        getAllAvailableProducts();
        Scanner scanner = new Scanner(System.in);

        //diese ganze Logik der While Schlaufe lässt sich eigentlich auf eine Zeile kürzen. Weisst du wie?
        boolean addingProducts = true;
        while (addingProducts) {
           addingProducts = addNewProducts(scanner);
        }

        //TODO: die Ausgabe der Produkte ist aktuell unschön. Verbessere das. Es gibt diverse Ansätze dafür.
        System.out.println("Du hast folgende Produkte hinzugefügt: ");
        for (Object product : productList){
            System.out.println(product);
        }

        //TODO: kannst du allenfalls das Programm so erweitern, dass der Benuzter die Anzahl anpassen kann? Oder vielleicht doch wieder Produkte hinzufügen kann?
    }

    private boolean addNewProducts(Scanner scanner) {

        //Der Willkomenstext wird zu oft ausgegeben. Mach was dagegen.
if(productList.size() == 0) {
    System.out.println("Herzlich Willkommen zu dieser innovativen und ewig lebender Shopping Liste. Basierend auf der einzigartigen Konsole.");
}
        System.out.println("Welches Produkt möchtest du der Einkaufsliste hinzufügen? Gib die Produktnummer eines aus der Liste üblicher Produkte aus.");

        for (int i = 0; i < availableProducts.length; i++) {
            System.out.println("Produktnummer: " + i + " Produktname: " + availableProducts[i]);

        }
        int userProductInput = scanner.nextInt();

        switch (userProductInput) {
            //TODO: momentan ist diese Variante sehr fehleranfällig. Ändert sich die Produktliste, stimmen die Zahlen nicht mehr. Kennst du ein Konzept, das zu verbessern?
            case 0:
                //TODO: Preis und Anzahl spielen noch keine Rolle. Wie kannst du das richtig einbinden?
                productList.add(new Duebel (1, 10));
                break;
                //erstelle eine korrekte Klasse für 'Sicherung'
            case 1:
                productList.add(new Sicherung(1, 10));
                break;
            //erstelle eine korrekte Klasse für 'Light Saber'
            case 2:
                productList.add(new LightSaber (1, 10));
                break;
            //erstelle eine korrekte Klasse für 'Mikroskop'
            case 3:
                productList.add(new Mikroskop (1, 10));
                break;
            //erstelle eine korrekte Klasse für 'RAM'
            case 4:
                productList.add(new RAM (1, 10));
                break;
            default:
                System.out.println("Deine gewählte Zahl entspricht keinem Produkt. Versuchs nochmal");
        }

        {
            System.out.println("Weitere Produkte hinzufügen? Gib 'n' ein zum abbrechen oder 'j' zum weitermachen.");
            String userInput = scanner.next();

            //es soll egal sein, ob der User das 'n' gross oder klein schreibt.
            if (userInput.toLowerCase().startsWith("n")) {
                return false;
            } else {
                return true;
            }
        }}




    private void getAllAvailableProducts() {
        //schreibe die Zuweisung der Werte kürzer
        availableProducts = new String[]{"Dübel", "Sicherung", "Light Saber", "Mikroskop", "RAM"};

    }}

