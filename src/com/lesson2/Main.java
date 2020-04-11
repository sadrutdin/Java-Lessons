package com.lesson2;

public class Main {
    public static void main(String[] args) {

        School school1 = new School("Школа #6");

        System.out.println(school1.getName());

        School school2 = new School()
                .setName("Школа #2")
                .setSince(1997)
                .setStudentCount(100);
    }
}
