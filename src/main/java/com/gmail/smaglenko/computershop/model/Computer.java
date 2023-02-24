package com.gmail.smaglenko.computershop.model;

public abstract class Computer {
    private String manufacturer;
    private String operatingSystem;
    private String processor;
    private int memory;
    private int storage;
    private double price;

    public Computer(String manufacturer, String operatingSystem, String processor, int memory,
                    int storage, double price) {
        this.manufacturer = manufacturer;
        this.operatingSystem = operatingSystem;
        this.processor = processor;
        this.memory = memory;
        this.storage = storage;
        this.price = price < 0 ? 0 : price;
    }

    public abstract void showCharacteristics();

    public abstract String getType();

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price < 0 ? 0 : price;
    }
}
