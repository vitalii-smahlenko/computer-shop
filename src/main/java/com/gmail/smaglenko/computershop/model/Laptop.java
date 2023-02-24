package com.gmail.smaglenko.computershop.model;

public class Laptop extends Computer {
    private double screenDiagonal;
    private String typOfDisplay;

    public Laptop(String manufacturer, String operatingSystem, String processor, int memory,
                  int storage, double price, double screenDiagonal, String typOfDisplay) {
        super(manufacturer, operatingSystem, processor, memory, storage, price);
        this.screenDiagonal = screenDiagonal;
        this.typOfDisplay = typOfDisplay;
    }

    @Override
    public void showCharacteristics() {
        System.out.format("Type PC: %s; Manufacturer: %s; Diagonal: %.1f; Typ of display: %s; "
                        + "Operating System: %s; Processor: %s; RAM: %d; Storage: %d; "
                        + "Price: %.2f$;\n", getType(), getManufacturer(), getScreenDiagonal(),
                getTypOfDisplay(), getOperatingSystem(), getProcessor(), getMemory(), getStorage(),
                getPrice());
    }

    @Override
    public String getType() {
        return TypeOfComputer.LAPTOP.getType();
    }

    public double getScreenDiagonal() {
        return screenDiagonal;
    }

    public void setScreenDiagonal(double screenDiagonal) {
        this.screenDiagonal = screenDiagonal;
    }

    public String getTypOfDisplay() {
        return typOfDisplay;
    }

    public void setTypOfDisplay(String typOfDisplay) {
        this.typOfDisplay = typOfDisplay;
    }
}
