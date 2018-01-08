/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2017.
 */

package ch.sbb.shoppinglist;

public class Duebel extends Product {

    private String productName = "Duebel";
    private String productKuerzel = "dub";


    @Override
    public String getProductnameName() {
        return productName;
    }

    @Override
    public String getProductKuerzel() {
        return productKuerzel;
    }

    //macht es wirklich Sinn, dass alles im Konstruktor zu machen?
    //Laut ShoppingList.java sollte man am Anfang noch keine Attribute setzen. Deshalb unnötig

}