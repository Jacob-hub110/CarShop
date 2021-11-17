package com.capgemini.carshop.artikels;

public abstract class AbstractArticle {

    protected double price;
    protected int catalogNumber;
    protected String manufacturer;

    public AbstractArticle(double price, int catalogNumber, String manufacturer) {
        this.price = price;
        this.catalogNumber = catalogNumber;
        this.manufacturer = manufacturer;
    }

    public abstract double getNetPrice();
}
