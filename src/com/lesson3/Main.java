package com.lesson3;

import com.lesson3.dto.People;
import com.lesson3.service.Zags;

public class Main {
    public static void main(String[] args) {
        People p1 = new People()
                .setName("Леонид")
                .setMarried(false)
                .setSex("MEN");

        People p2 = new People()
                .setName("Елена")
                .setMarried(false)
                .setSex("WOMEN");

        People p3 = new People()
                .setName("Сергей")
                .setMarried(false)
                .setSex("MEN");

        People p4 = new People()
                .setName("Леонид")
                .setMarried(false)
                .setSex("MEN");

        People p5 = new People()
                .setName("Ольга")
                .setMarried(true)
                .setSex("WOMEN");

        People p6 = new People()
                .setName("Никоай")
                .setMarried(false)
                .setSex("MEN");

        Zags zags = new Zags("Районный ЗАГС города Краснодар");

        zags.married(p1, p2);
        zags.married(p3, p4);
        zags.married(p5, p6);
    }
}
