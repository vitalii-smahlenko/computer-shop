package com.gmail.smaglenko.computershop.service.impl;

import com.gmail.smaglenko.computershop.model.Client;
import com.gmail.smaglenko.computershop.service.ClientService;

public class ClientServiceImpl implements ClientService {
    @Override
    public Client createClient(String name) {
        return new Client(name);
    }
}
