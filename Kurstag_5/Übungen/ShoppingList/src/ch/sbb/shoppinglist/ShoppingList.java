/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2017.
 */

package ch.sbb.shoppinglist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ShoppingList {

    Scanner scanner = new Scanner(System.in);
    private String[] availableProducts;
    private String[] availableProductsKuerzel;
    //versuche zu begründen, wieso der Typ der Liste hier "Object" ist. Wir werden später lernen, wie man so was richtig macht.
    //Es ist Object, weil wir Objekte von verschiedenen Arten in die Liste speichern. wie z.B. Dübel, Mikroskop usw.
    private List<Product> productList = new ArrayList<>();

    //Siehe auch bei der main-Klasse. Irgendwie wird der Code nicht ausgeführt. Wieso? Die funktion wird nicht aufgerufen
    public void startShoppApp() {
        getAllAvailableProducts();

        //diese ganze Logik der While Schlaufe lässt sich eigentlich auf eine Zeile kürzen. Weisst du wie?
        while (true) {
            boolean doAbbruch = addNewProducts();

            if(!doAbbruch){
                return;
            }
        //kannst du allenfalls das Programm so erweitern, dass der Benuzter die Anzahl anpassen kann? Oder vielleicht doch wieder Produkte hinzufügen kann?
        }
    }

    private boolean addNewProducts() {

        //Der Willkomenstext wird zu oft ausgegeben. Mach was dagegen.
        if(productList.size() == 0){
            System.out.println("Herzlich Willkommen zu dieser innovativen und ewig lebender Shopping Liste. Basierend auf der einzigartigen Konsole.");
        }
        System.out.println("Welches Produkt möchtest du der Einkaufsliste hinzufügen? Gib das Produktkuerzel eines aus der Liste üblicher Produkte aus.");

        for (int i = 0; i < availableProducts.length; i++) {
            System.out.println("ProduktKuerzel: " + availableProductsKuerzel[i] + " Produktname: " + availableProducts[i]);
        }
        String userProductInput = scanner.next().toLowerCase().trim();

        switch (userProductInput) {
            //TODO: momentan ist diese Variante sehr fehleranfällig. Ändert sich die Produktliste, stimmen die Zahlen nicht mehr. Kennst du ein Konzept, das zu verbessern?
            case "dub":
                //Preis und Anzahl spielen noch keine Rolle. Wie kannst du das richtig einbinden? Konstruktor ohne Parameter aufrufen
                productList.add(new Duebel());
                break;
                //erstelle eine korrekte Klasse für 'Sicherung'
            case "sic":
                productList.add(new Sicherung());
                break;
            case "lis":
                productList.add(new LightSaber());
                break;
            //erstelle eine korrekte Klasse für 'Mikroskop'
            case "mik":
                productList.add(new Mikroskop());
                break;
            //erstelle eine korrekte Klasse für 'RAM'
            case "ram":
                productList.add(new RAM());
                break;
            default:
                System.out.println("deine gewählte Zahl entspricht keinem Produkt. Versuchs nochmal");
        }
        //die Ausgabe der Produkte ist aktuell unschön. Verbessere das. Es gibt diverse Ansätze dafür.
        showProducts();

        checkForModify();

        System.out.println("Weitere Produkte hinzufügen? Gib 'n' ein zum abbrechen oder 'j' zum weitermachen.");
        String userInput = scanner.next().toLowerCase().trim();

        //Tes soll egal sein, ob der User das 'n' gross oder klein schreibt.
        if (userInput.toLowerCase().startsWith("n")){
            echo("Vielen Dank und auf Wiedersehen");
            return false;
        } else {
            return true;
        }
    }

    private void getAllAvailableProducts() {
        availableProducts = new String[]{"Dübel", "Sicherung", "Light Saber", "Mikroskop", "RAM"};
        availableProductsKuerzel = new String[]{"dub", "sic", "lis", "mik", "ram"};
    }

    private void echo(String arg){
        System.out.println(arg);
    }

    private void showProducts(){
        System.out.println("Du hast folgende Produkte im Warenkorb: ");
        int temp = 1;
        for (Product product : productList){
            if(product instanceof Duebel){
                Duebel duebel = (Duebel) product;
                echo(temp + ". Dübel, Anzahl: " + duebel.getAnzahl());
            } else if(product instanceof Sicherung){
                Sicherung sicherung = (Sicherung) product;
                echo(temp + ". Sicherung, Anzahl: " + sicherung.getAnzahl());
            } else if(product instanceof LightSaber){
                LightSaber lightSaber = (LightSaber) product;
                echo(temp + ". Light Saber, Anzahl: " + lightSaber.getAnzahl());
            } else if(product instanceof Mikroskop){
                Mikroskop mikroskop = (Mikroskop) product;
                echo(temp + ". Mikroskop, Anzahl: " + mikroskop.getAnzahl());
            } else if(product instanceof RAM){
                RAM ram = (RAM) product;
                echo(temp + ". RAM, Anzahl: " + ram.getAnzahl());
            }
            temp++;
        }
    }

    private void checkForModify(){
        echo("Möchten Sie die Anzahl eines Produkts anpassen? Gib 'n' ein zum abbrechen oder 'j' zum bearbeiten");
        scanner.nextLine();
        String yesOrNo = scanner.nextLine().toLowerCase().trim();
        if (yesOrNo.equals("j")){
            modifyList();
        }
    }

    private void modifyList(){
        Product[] tempProductList = productList.toArray(new Product[productList.size()]);

        echo("Welches Produkt? (Bsp: 1)");
        int input = scanner.nextInt();
        input -= 1;

        echo("Anzahl: ");
        int number = scanner.nextInt();

        tempProductList[input].setAnzahl(number); //ist nun möglich Dank der Product-Klasse

        productList = new ArrayList<>(Arrays.asList(tempProductList));

        showProducts();
    }
}
