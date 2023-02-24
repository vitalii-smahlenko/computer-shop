package com.gmail.smaglenko.computershop.service.impl;

import com.gmail.smaglenko.computershop.model.Computer;
import com.gmail.smaglenko.computershop.model.Warehouse;
import com.gmail.smaglenko.computershop.service.WarehouseService;

public class WarehouseServiceImpl implements WarehouseService {
    private Warehouse warehouse;

    public WarehouseServiceImpl(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void addToStock(Computer computer) {
        warehouse.getStock().add(computer);
    }

    @Override
    public void removeFromStock(Computer computer) {
        warehouse.getStock().remove(computer);
    }
}
