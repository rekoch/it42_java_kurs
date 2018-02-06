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
    //versuche zu begründen, wieso der Typ der Liste hier "Object" ist. Wir werden später lernen, wie man so was richtig macht.
    // da hier nur objekte erfasst werden.
    private List<Object> productList = new ArrayList<>();



    //Siehe auch bei der main-Klasse. Irgendwie wird der Code nicht ausgeführt. Wieso?
    //Diese Methode muss zuerst noch in der Main_Schiffe Klasse aufgerufen werden.
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
                productList.add(new Duebel());
                break;
                //erstelle eine korrekte Klasse für 'Sicherung'
            case 1:
                productList.add(new Sicherung());
                break;
            //erstelle eine korrekte Klasse für 'Light Saber'
            case 2:
                productList.add(new LightSaber());
                break;
            //erstelle eine korrekte Klasse für 'Mikroskop'
            case 3:
                productList.add(new Mikroskop());
                break;
            //erstelle eine korrekte Klasse für 'RAM'
            case 4:
                productList.add(new RAM());
                break;
            default:
                System.out.println("deine gewählte Zahl entspricht keinem Produkt. Versuchs nochmal");
        }
        System.out.println("Ihr Wahrenkorb beinhaltet momentan");
        showShoppingcart();





        System.out.println("Weitere Produkte hinzufügen? Gib 'n' ein zum abbrechen oder 'j' zum weitermachen.");
        String userInput = scanner.next();


        //es soll egal sein, ob der User das 'n' gross oder klein schreibt.
        if (userInput.toLowerCase().startsWith("n")){
            return false;
        } else {
            return true;
        }
    }

    private void getAllAvailableProducts() {
        //schreibe die Zuweisung der Werte kürzer
        availableProducts = new String[]{"Dübel", "Sicherung", "Light Saber", "Mikroskop", "RAM"};
    }


    //Gespickt bei Florian Borter
    public void showShoppingcart(){
        int temp = 1;
        for (Object product : productList){
            if(product instanceof Duebel){
                Duebel duebel = (Duebel) product;
                System.out.println(temp + ". Dübel, Anzahl: " + duebel.getAnzahl());
            } else if(product instanceof Sicherung){
                Sicherung sicherung = (Sicherung) product;
                System.out.println(temp + ". Sicherung, Anzahl: " + sicherung.getAnzahl());
            } else if(product instanceof LightSaber){
                LightSaber lightSaber = (LightSaber) product;
                System.out.println(temp + ". Light Saber, Anzahl: " + lightSaber.getAnzahl());
            } else if(product instanceof Mikroskop){
                Mikroskop mikroskop = (Mikroskop) product;
                System.out.println(temp + ". Mikroskop, Anzahl: " + mikroskop.getAnzahl());
            } else if(product instanceof RAM){
                RAM ram = (RAM) product;
                System.out.println(temp + ". RAM, Anzahl: " + ram.getAnzahl());
            }
            temp++;
            Modifie();
        }
    }


    public void Modifie(){
        System.out.println("Möchten Sie änderungen an dem Produkt vornehmen?(j/n)");
        String changes = scanner.nextLine();
        if(changes.toLowerCase().startsWith("j")){
            changes();
        }
    }


    public void changes() {
        Object[] tempProductList = productList.toArray();

        System.out.println("Welches Produkt? (Bsp: 1)");
        int input = scanner.nextInt();
        input -= 1;

        System.out.println("Anzahl: ");
        int number = scanner.nextInt();

        if(tempProductList[input] instanceof Duebel){
            Duebel duebel = (Duebel)tempProductList[input];
            duebel.setAnzahl(number);
            tempProductList[input] = duebel;
        } else if(tempProductList[input] instanceof Sicherung){
            Sicherung sicherung = (Sicherung) tempProductList[input];
            sicherung.setAnzahl(number);
            tempProductList[input] = sicherung;
        } else if(tempProductList[input] instanceof LightSaber){
            LightSaber lightSaber = (LightSaber) tempProductList[input];
            lightSaber.setAnzahl(number);
            tempProductList[input] = lightSaber;
        } else if(tempProductList[input] instanceof Mikroskop){
            Mikroskop mikroskop = (Mikroskop) tempProductList[input];
            mikroskop.setAnzahl(number);
            tempProductList[input] = mikroskop;
        } else if(tempProductList[input] instanceof RAM){
            RAM ram = (RAM)tempProductList[input];
            ram.setAnzahl(number);
            tempProductList[input] = ram;
        }

        productList = new ArrayList<>(Arrays.asList(tempProductList));

        showShoppingcart();
    }

}
