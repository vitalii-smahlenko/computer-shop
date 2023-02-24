package com.gmail.smaglenko.computershop.service;

import com.gmail.smaglenko.computershop.model.Client;
import com.gmail.smaglenko.computershop.model.Computer;
import com.gmail.smaglenko.computershop.model.ShoppingCart;

public interface ShoppingCartService {
    ShoppingCart createShoppingCart(Client client);

    void addComputerToShoppingCart (ShoppingCart shoppingCart, Computer computer);

    public void clear(ShoppingCart shoppingCart);
}
