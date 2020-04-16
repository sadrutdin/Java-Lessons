package com.lesson5.customer;

public abstract class AbstractCustomer implements Customer {
    protected String name;

    public AbstractCustomer(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}