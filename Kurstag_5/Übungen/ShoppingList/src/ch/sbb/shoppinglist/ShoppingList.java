/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2017.
 */

package ShoppingList.src.ch.sbb.shoppinglist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShoppingList {

    private String[] availableProducts;
    //TODO: versuche zu begründen, wieso der Typ der Liste hier "Object" ist. Wir werden später lernen, wie man so was richtig macht.
    // da hier nur objekte erfasst werden.
    private List<Object> productList = new ArrayList<>();

    //TODO: Siehe auch bei der main-Klasse. Irgendwie wird der Code nicht ausgeführt. Wieso?
    //Diese Methode muss zuerst noch in der Main Klasse aufgerufen werden.
    public void startShoppApp() {
        getAllAvailableProducts();
        Scanner scanner = new Scanner(System.in);

        //TODO: diese ganze Logik der While Schlaufe lässt sich eigentlich auf eine Zeile kürzen. Weisst du wie?
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

        //TODO: Der Willkomenstext wird zu oft ausgegeben. Mach was dagegen.
        System.out.println("Herzlich Willkommen zu dieser innovativen und ewig lebender Shopping Liste. Basierend auf der einzigartigen Konsole.");
        System.out.println("Welches Produkt möchtest du der Einkaufsliste hinzufügen? Gib die Produktnummer eines aus der Liste üblicher Produkte aus.");

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
                //TODO: erstelle eine korrekte Klasse für 'Sicherung'
            case 1:
                productList.add(new Duebel(1, 10));
                break;
            //TODO: erstelle eine korrekte Klasse für 'Light Saber'
            case 2:
                productList.add(new Duebel(1, 10));
                break;
            //TODO: erstelle eine korrekte Klasse für 'Mikroskop'
            case 3:
                productList.add(new Duebel(1, 10));
                break;
            //TODO: erstelle eine korrekte Klasse für 'RAM'
            case 4:
                productList.add(new Duebel(1, 10));
                break;
            default:
                System.out.println("deine gewählte Zahl entspricht keinem Produkt. Versuchs nochmal");
        }
        System.out.println("Weitere Produkte hinzufügen? Gib 'n' ein zum abbrechen oder 'j' zum weitermachen.");
        String userInput = scanner.next();

        //TODO: es soll egal sein, ob der User das 'n' gross oder klein schreibt.
        if (userInput.startsWith("n")){
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
