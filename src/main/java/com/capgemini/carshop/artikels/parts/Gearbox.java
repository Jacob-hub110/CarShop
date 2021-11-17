package com.capgemini.carshop.artikels.parts;


public final class Gearbox extends Part implements Interchangeable {
    private final int gears;
    private final boolean manual;

    public Gearbox(double price, int catalogNumber, String manufacturer, int originalPartNumber, int gears, boolean manual) {
        super(price, catalogNumber, manufacturer, originalPartNumber);
        this.gears = gears;
        this.manual = manual;
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
