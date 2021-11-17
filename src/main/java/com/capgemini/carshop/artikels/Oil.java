package com.capgemini.carshop.artikels;


import java.time.LocalDate;

public class Oil extends AbstractArticle {
   private final LocalDate expireDate;

    public Oil(double price, int catalogNumber, String manufacturer, LocalDate expireDate) {
        super(price, catalogNumber, manufacturer);
        this.expireDate = expireDate;
    }

    @Override
    public double getNetPrice() {
        return 0;
    }
}
