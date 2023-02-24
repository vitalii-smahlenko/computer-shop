package com.gmail.smaglenko.computershop.service;

import com.gmail.smaglenko.computershop.model.Order;
import com.gmail.smaglenko.computershop.model.ShoppingCart;

public interface OrderService {
    Order createOrder(ShoppingCart shoppingCart);
}