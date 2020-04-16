package com.lesson5.customer;

import java.time.LocalDate;

public class CompanyCustomer extends AbstractCustomer implements Customer {
    private int since;

    public CompanyCustomer(String name, int since) {
        super(name);
        this.since = since;
    }

    @Override
    public int getOldYear() {
        return LocalDate.now().getYear() - since;
    }
}
