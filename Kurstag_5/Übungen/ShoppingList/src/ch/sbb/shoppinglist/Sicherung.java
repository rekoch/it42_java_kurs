/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2017.
 */

package ch.sbb.shoppinglist;

public class Sicherung extends Product {

    private String productName = "Sicherung";
    private String productKuerzel = "sic";


    @Override
    public String getProductnameName() {
        return productName;
    }

    @Override
    public String getProductKuerzel() {
        return productKuerzel;
    }
}
