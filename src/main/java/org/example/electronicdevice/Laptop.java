package org.example.electronicdevice;

public class Laptop extends Device {
    private final int ramSize; // in GB
    private final String processorType;

    public Laptop(String name, double price, double weight, int ramSize, String processorType) {
        super(name, price, weight);
        this.ramSize = ramSize;
        this.processorType = processorType;
    }

    @Override
    public String toString() {
        return super.toString() + ", RAM Size: " + ramSize + " GB, Processor: " + processorType;
    }
}
