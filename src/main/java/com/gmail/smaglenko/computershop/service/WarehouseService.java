package com.gmail.smaglenko.computershop.service;

import com.gmail.smaglenko.computershop.model.Computer;

public interface WarehouseService {
    void addToStock(Computer computer);

    void removeFromStock(Computer computer);
}
