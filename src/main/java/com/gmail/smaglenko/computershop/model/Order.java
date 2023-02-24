package com.gmail.smaglenko.computershop.model;

import java.util.List;

public class Order {
    private Client client;
    private List<Computer> computers;

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Computer> getComputers() {
        return computers;
    }

    public void setComputers(List<Computer> computers) {
        this.computers = computers;
    }
}
