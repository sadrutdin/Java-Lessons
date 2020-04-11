package com.lesson1;

class People {
    int old;
    String name;

    // ВозвращаемыйТип имяМетода ( типПараметра1 параметр1, ... ) {
    // ...
    // return возвращаемоеЗначение;
    // }

    void go() {
        this.go(3);
    }

    void go(double speed) {
        System.out.println("Я хочу со скоростью " + speed + " км/ч");
    }

    void printName() {
        System.out.println(this.name);
    }

    String getInfo() {
        return "Меня зовут " + this.name + ". Мне " + this.old + " лет.";
    }

    int getOld() {
        return old;
    }

    void setOld(int old) {
        this.old = old;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }
}
