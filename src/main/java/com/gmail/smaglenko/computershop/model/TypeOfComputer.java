package com.gmail.smaglenko.computershop.model;

public enum TypeOfComputer {
    DESKTOP("Desktop"),
    LAPTOP("Laptop");

    private final String type;

    TypeOfComputer(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
