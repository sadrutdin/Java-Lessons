package com.lesson5.service;

import com.lesson5.customer.Customer;

import java.time.LocalDateTime;

public interface Store {
    /**
     * Покупка товара
     *
     * @param customer покупатель
     * @return дата и время покупки
     */
    LocalDateTime buy(Customer customer);
}
