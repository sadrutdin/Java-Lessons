package com.lesson1;

public class Main {

    public static void main(String[] args) {

        // Тип имяПеременной = new ИмяКласса();
        People p;
        p = new People();

        p.setOld(10);
        p.setName("Ольга");

        System.out.println(p.getName());
        System.out.println(p.getOld());

        p.printName();
        p.go();
        p.go(5);

        String info = p.getInfo();
        System.out.println("info = " + info);
    }


}
