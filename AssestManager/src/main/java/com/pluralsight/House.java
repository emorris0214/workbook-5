package com.pluralsight;

public class House extends Asset {
    private String address;
    private int condition; // 1-excellent, 2-good, 3-fair, 4-poor
    private int squareFoot, lotSize;

    public House(String description, String dateAcquired, double originalCost, String address, int condition, int squareFoot, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public double getValue() {
        double rate;
        switch (condition) {
            case 1: rate = 180.0; break;
            case 2: rate = 130.0; break;
            case 3: rate = 90.0; break;
            case 4: rate = 80.0; break;
            default: rate = 0.0;
        }
        return (rate * squareFoot) + (0.25 * lotSize);
    }
}
