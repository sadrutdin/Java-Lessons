package com.lesson5.customer;

import java.time.LocalDate;

public class IndividualCustomer extends AbstractCustomer implements Customer {
    private LocalDate birthDate;

    public IndividualCustomer(String name, LocalDate birthDate) {
        super(name);
        this.birthDate = birthDate;
    }

    @Override
    public int getOldYear() {
        return LocalDate.now().getYear() - birthDate.getYear();
    }
}
