package com.gmail.smaglenko.computershop.service.impl;

import com.gmail.smaglenko.computershop.model.Client;
import com.gmail.smaglenko.computershop.model.Computer;
import com.gmail.smaglenko.computershop.model.ShoppingCart;
import com.gmail.smaglenko.computershop.service.ShoppingCartService;
import java.util.ArrayList;

public class ShoppingCartServiceImpl implements ShoppingCartService {
    @Override
    public ShoppingCart createShoppingCart(Client client) {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.setClient(client);
        return shoppingCart;
    }

    @Override
    public void addComputerToShoppingCart(ShoppingCart shoppingCart, Computer computer) {
        shoppingCart.getComputers().add(computer);
    }

    @Override
    public void clear(ShoppingCart shoppingCart) {
        shoppingCart.getComputers().clear();
    }
}
