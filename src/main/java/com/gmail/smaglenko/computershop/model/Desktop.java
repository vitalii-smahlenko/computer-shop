package com.gmail.smaglenko.computershop.model;

public class Desktop extends Computer {
    private int powerSupplyCapacity;

    public Desktop(String manufacturer, String operatingSystem, String processor, int memory,
                   int storage, int powerSupplyCapacity, double price) {
        super(manufacturer, operatingSystem, processor, memory, storage, price);
        this.powerSupplyCapacity = powerSupplyCapacity;
    }

    @Override
    public void showCharacteristics() {
        System.out.format("Type PC: %s; Manufacturer: %s; Operating System: %s; Processor: %s; "
                        + "RAM: %d; Storage: %d; Power supply capacity: %d; Price: %.2f$;\n",
                getType(), getManufacturer(), getOperatingSystem(), getProcessor(), getMemory(),
                getStorage(), getPowerSupplyCapacity(), getPrice());
    }

    @Override
    public String getType() {
        return TypeOfComputer.DESKTOP.getType();
    }

    public int getPowerSupplyCapacity() {
        return powerSupplyCapacity;
    }

    public void setPowerSupplyCapacity(int powerSupplyCapacity) {
        this.powerSupplyCapacity = powerSupplyCapacity;
    }
}
