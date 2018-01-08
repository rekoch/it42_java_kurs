/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2017.
 */

package ch.sbb.shoppinglist;

public class LightSaber extends Product {

    private String productName = "Light Saber";
    private String productKuerzel = "lis";


    @Override
    public String getProductnameName() {
        return productName;
    }

    @Override
    public String getProductKuerzel() {
        return productKuerzel;
    }
}
