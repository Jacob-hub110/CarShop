package com.capgemini.carshop.artikels.parts;

public final class Damper extends Part implements Interchangeable {

    private final int height;
    private final DamperType type;

    public Damper(double price, int catalogNumber, String manufacturer, int originalPartNumber, int height, DamperType type) {
        super(price, catalogNumber, manufacturer, originalPartNumber);
        this.height = height;
        this.type = type;
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
