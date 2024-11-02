package org.example.electronicdevice;

public class Smartphone extends Device {
    private final double screenSize;
    private final double cameraResolution;

    public Smartphone(String name, double price, double weight, double screenSize, double cameraResolution) {
        super(name, price, weight);
        this.screenSize = screenSize;
        this.cameraResolution = cameraResolution;
    }

    @Override
    public String toString() {
        return super.toString() + ", Screen Size: " + screenSize + " inches, Camera Resolution: " + cameraResolution + " MP";
    }
}
