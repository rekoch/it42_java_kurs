/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2017.
 */

package ch.sbb.shoppinglist;

public class Mikroskop extends Product {

    private String productName = "Mikroskop";
    private String productKuerzel = "mik";


    @Override
    public String getProductnameName() {
        return productName;
    }

    @Override
    public String getProductKuerzel() {
        return productKuerzel;
    }
}
