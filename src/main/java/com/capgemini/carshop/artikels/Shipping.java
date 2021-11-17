package com.capgemini.carshop.artikels;


public class Shipping {
    private double price;
    private ShippingType shippingType;

    public Shipping(double price, ShippingType shippingType) {
        this.price = price;
        this.shippingType = shippingType;
    }
}
