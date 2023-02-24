package com.gmail.smaglenko.computershop;

import com.gmail.smaglenko.computershop.model.Client;
import com.gmail.smaglenko.computershop.model.Computer;
import com.gmail.smaglenko.computershop.model.Desktop;
import com.gmail.smaglenko.computershop.model.Laptop;
import com.gmail.smaglenko.computershop.model.ShoppingCart;
import com.gmail.smaglenko.computershop.model.Warehouse;
import com.gmail.smaglenko.computershop.service.ClientService;
import com.gmail.smaglenko.computershop.service.OrderService;
import com.gmail.smaglenko.computershop.service.ShoppingCartService;
import com.gmail.smaglenko.computershop.service.WarehouseService;
import com.gmail.smaglenko.computershop.service.impl.ClientServiceImpl;
import com.gmail.smaglenko.computershop.service.impl.OrderServiceImpl;
import com.gmail.smaglenko.computershop.service.impl.ShoppingCartServiceImpl;
import com.gmail.smaglenko.computershop.service.impl.WarehouseServiceImpl;
import java.util.ArrayList;
import java.util.List;

public class ComputerShop {
    public static void main(String[] args) {
        Computer desktop = new Desktop("HP", "Windows 10", "i7",
                32, 512, 380, 700);
        Computer laptop = new Laptop("Lenovo", "Windows 11", "i7",
                16, 1024, 1000, 15.6, "IPS");
        Computer laptopHp = new Laptop("HP", "Windows 10", "i5",
                8, 256, 500, 15.6, "IPS");
        List<Computer> stock = new ArrayList<>();
        Warehouse warehouse = new Warehouse(stock);
        WarehouseService warehouseService = new WarehouseServiceImpl(warehouse);
        warehouseService.addToStock(desktop);
        warehouseService.addToStock(laptop);
        warehouseService.addToStock(laptopHp);
        ClientService clientService = new ClientServiceImpl();
        Client vitalii = clientService.createClient("Vitalii");
        System.out.println("**Available in stock before buy**");
        warehouse.getStock().forEach(Computer::showCharacteristics);
        ShoppingCartService shoppingCartService = new ShoppingCartServiceImpl();
        ShoppingCart shoppingCart = shoppingCartService.createShoppingCart(vitalii);
        shoppingCartService.addComputerToShoppingCart(shoppingCart, laptop);
        shoppingCartService.addComputerToShoppingCart(shoppingCart, desktop);
        OrderService orderService = new OrderServiceImpl(warehouseService, shoppingCartService);
        orderService.createOrder(shoppingCart);
        System.out.println("**Available in stock after buy**");
        warehouse.getStock().forEach(Computer::showCharacteristics);
    }
}
