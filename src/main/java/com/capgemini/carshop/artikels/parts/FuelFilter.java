package com.capgemini.carshop.artikels.parts;


public final class FuelFilter extends Part implements Interchangeable {
    private final FuelType fuelType;

    public FuelFilter(double price, int catalogNumber, String manufacturer, int originalPartNumber, FuelType fuelType) {
        super(price, catalogNumber, manufacturer, originalPartNumber);
        this.fuelType = fuelType;
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
