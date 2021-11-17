package com.capgemini.carshop.artikels.parts;


public final class Spring extends Part implements Interchangeable {
    private int height;

    public Spring(double price, int catalogNumber, String manufacturer, int originalPartNumber, int height) {
        super(price, catalogNumber, manufacturer, originalPartNumber);
        this.height = height;
    }

    @Override
    public double getNetPrice() {
        return 0;
    }

    @Override
    public boolean isCompatible(Part p) {
        return false;
    }
}
