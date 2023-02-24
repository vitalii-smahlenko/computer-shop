package com.gmail.smaglenko.computershop.model;

import java.util.List;

public class Warehouse {
    private List<Computer> stock;

    public Warehouse(List<Computer> stock) {
        this.stock = stock;
    }

    public List<Computer> getStock() {
        return stock;
    }
}
