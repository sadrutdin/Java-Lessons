package com.lesson3.dto;

public class People {
    String name;
    String sex;
    boolean married;

    public String getName() {
        return name;
    }

    public People setName(String name) {
        this.name = name;
        return this;
    }

    public String getSex() {
        return sex;
    }

    public People setSex(String sex) {
        this.sex = sex;
        return this;
    }

    public boolean isMarried() {
        return married;
    }

    public People setMarried(boolean married) {
        this.married = married;
        return this;
    }
}
