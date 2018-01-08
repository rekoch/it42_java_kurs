/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2017.
 */

package ch.sbb.shoppinglist;

public class RAM extends Product {

    private String productName = "RAM";
    private String productKuerzel = "ram";


    @Override
    public String getProductnameName() {
        return productName;
    }

    @Override
    public String getProductKuerzel() {
        return productKuerzel;
    }
}
