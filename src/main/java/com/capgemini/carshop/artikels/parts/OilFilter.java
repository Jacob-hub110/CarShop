package com.capgemini.carshop.artikels.parts;


public final class OilFilter extends Part implements Interchangeable {

    public OilFilter(double price, int catalogNumber, String manufacturer, int originalPartNumber) {
        super(price, catalogNumber, manufacturer, originalPartNumber);
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
