/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2017.
 */

package ch.sbb.shoppinglist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShoppingList {

    private String[] availableProducts;
    //TODO: versuche zu begründen, wieso der Typ der Liste hier "Object" ist. Wir werden später lernen, wie man so was richtig macht.
    private List<Object> productList = new ArrayList<>();

    //TODO: Siehe auch bei der main-Klasse. Irgendwie wird der Code nicht ausgeführt. Wieso? XXX
    public void startShoppApp() {

        //TODO: Der Willkomenstext wird zu oft ausgegeben. Mach was dagegen. XXX
        System.out.println("Herzlich Willkommen zu dieser innovativen und ewig lebender Shopping Liste. Basierend auf der einzigartigen Konsole.");
        System.out.println("Welches Produkt möchtest du der Einkaufsliste hinzufügen? Gib die Produktnummer eines aus der Liste üblicher Produkte aus.");

        getAllAvailableProducts();
        Scanner scanner = new Scanner(System.in);

        //TODO: diese ganze Logik der While Schlaufe lässt sich eigentlich auf eine Zeile kürzen. Weisst du wie? XXX
        while (addNewProducts(scanner)) {} // Für was ist die Schlaufe überhaupt?

        //TODO: die Ausgabe der Produkte ist aktuell unschön. Verbessere das. Es gibt diverse Ansätze dafür.
        System.out.println("Du hast folgende Produkte hinzugefügt: ");
        for (Object product : productList){
            System.out.println(product);
        }

        //TODO: kannst du allenfalls das Programm so erweitern, dass der Benuzter die Anzahl anpassen kann? Oder vielleicht doch wieder Produkte hinzufügen kann?
    }

    private boolean addNewProducts(Scanner scanner) {

        for (int i = 0; i < availableProducts.length; i++) {
            System.out.println("Produktnummer: " + i + " Produktname: " + availableProducts[i]);
        }
        int userProductInput = scanner.nextInt();

        switch (userProductInput) {
            //TODO: momentan ist diese Variante sehr fehleranfällig. Ändert sich die Produktliste, stimmen die Zahlen nicht mehr. Kennst du ein Konzept, das zu verbessern?
            case 0:
                //TODO: Preis und Anzahl spielen noch keine Rolle. Wie kannst du das richtig einbinden?
                productList.add(new Duebel(1));
                break;
                //TODO: erstelle eine korrekte Klasse für 'Sicherung' XXX
            case 1:
                productList.add(new Sicherung(3));
                break;
            //TODO: erstelle eine korrekte Klasse für 'Light Saber' XXX
            case 2:
                productList.add(new Light_Saber(4));
                break;
            //TODO: erstelle eine korrekte Klasse für 'Mikroskop' XXX
            case 3:
                productList.add(new Mikroskop(5));
                break;
            //TODO: erstelle eine korrekte Klasse für 'RAM' XXX
            case 4:
                productList.add(new RAM(2));
                break;
            default:
                System.out.println("deine gewählte Zahl entspricht keinem Produkt. Versuchs nochmal");
        }
        System.out.println("Weitere Produkte hinzufügen? Gib 'n' ein zum abbrechen oder 'j' zum weitermachen.");
        String userInput = scanner.next();

        //TODO: es soll egal sein, ob der User das 'n' gross oder klein schreibt. XXX
        if (userInput.equalsIgnoreCase("n")){
            return false;
        } else {
            return true;
        }
    }

    private void getAllAvailableProducts() {
        //TODO: schreibe die Zuweisung der Werte kürzer XXX
        availableProducts = new String[]{"Dübel", "Sicherung", "Light Saber", "Mikroskop", "RAM"};
    }

}
