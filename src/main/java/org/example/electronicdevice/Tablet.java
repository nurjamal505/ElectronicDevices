package org.example.electronicdevice;

public class Tablet extends Device {
    private final double batteryLife; // in hours
    private final boolean hasStylus;

    public Tablet(String name, double price, double weight, double batteryLife, boolean hasStylus) {
        super(name, price, weight);
        this.batteryLife = batteryLife;
        this.hasStylus = hasStylus;
    }

    @Override
    public String toString() {
        return super.toString() + ", Battery Life: " + batteryLife + " hours, Has Stylus: " + (hasStylus ? "Yes" : "No");
    }
}