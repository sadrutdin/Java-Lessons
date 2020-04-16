package com.lesson5.service;

import com.lesson5.customer.Customer;

import java.time.LocalDateTime;

public class StoreImpl implements Store {
    @Override
    public LocalDateTime buy(Customer customer) {
        System.out.println(customer.getName() + " купил товар.");
        return LocalDateTime.now();
    }
}
