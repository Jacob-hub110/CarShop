package com.capgemini.carshop.artikels.parts;

import com.capgemini.carshop.artikels.AbstractArticle;

public abstract class Part extends AbstractArticle {

    protected int originalPartNumber;

    public Part(double price, int catalogNumber, String manufacturer, int originalPartNumber) {
        super(price, catalogNumber, manufacturer);
        this.originalPartNumber = originalPartNumber;
    }
}
