package com.lesson3.service;

import com.lesson3.dto.People;

public class Zags {
    String name;

    public Zags(String name) {
        this.name = name;
    }

    public void married(People a, People b) {
        if (a.isMarried() || b.isMarried()) {
            System.out.println("Многожёнство в России запрещено!");
            return;
        }

        String sex1 = a.getSex();
        String sex2 = b.getSex();

        if (("WOMEN".equals(sex1) && "MEN".equals(sex2)) || ("WOMEN".equals(sex2) && "MEN".equals(sex1))) {

            a.setMarried(true);
            b.setMarried(true);
            System.out.println(this.name + " объявляет вас мужем и женой!");

        } else {
            System.out.println("Однополые браки запрещены!");
        }

    }
}
