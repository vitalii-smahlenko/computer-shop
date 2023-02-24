package com.gmail.smaglenko.computershop.service.impl;

import com.gmail.smaglenko.computershop.model.Order;
import com.gmail.smaglenko.computershop.model.ShoppingCart;
import com.gmail.smaglenko.computershop.service.OrderService;
import com.gmail.smaglenko.computershop.service.ShoppingCartService;
import com.gmail.smaglenko.computershop.service.WarehouseService;
import java.util.List;

public class OrderServiceImpl implements OrderService {
    private WarehouseService warehouseService;
    private ShoppingCartService shoppingCartService;

    public OrderServiceImpl(WarehouseService warehouseService, ShoppingCartService shoppingCartService) {
        this.warehouseService = warehouseService;
        this.shoppingCartService = shoppingCartService;
    }

    @Override
    public Order createOrder(ShoppingCart shoppingCart) {
        Order order = new Order();
        order.setClient(shoppingCart.getClient());
        order.setComputers(shoppingCart.getComputers());
        shoppingCart.getComputers().forEach(warehouseService::removeFromStock);
        shoppingCartService.clear(shoppingCart);
        return order;
    }
}
