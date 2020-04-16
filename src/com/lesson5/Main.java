package com.lesson5;

import com.lesson5.customer.CompanyCustomer;
import com.lesson5.customer.Customer;
import com.lesson5.customer.IndividualCustomer;
import com.lesson5.service.Store;
import com.lesson5.service.StoreImpl;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        Store store = new StoreImpl();

        IndividualCustomer customer1 = new IndividualCustomer("Садрутдин", LocalDate.of(1997, Month.MARCH, 26));
        CompanyCustomer customer2 = new CompanyCustomer("МеталХимПро", 2005);

        store.buy(customer1);
        store.buy(customer2);
    }
}
