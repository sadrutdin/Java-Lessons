package com.lesson4.obj;

public class Tourist extends People {
    private String fromCity;
    private String toCity;

    public String getFromCity() {
        return fromCity;
    }

    public void setFromCity(String fromCity) {
        this.fromCity = fromCity;
    }

    public String getToCity() {
        return toCity;
    }

    public void setToCity(String toCity) {
        this.toCity = toCity;
    }

    @Override
    public void printAboutMe() {
        System.out.println("I'm tourist. My name is " + super.getName());
    }
}
