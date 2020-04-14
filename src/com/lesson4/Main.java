package com.lesson4;

import com.lesson4.obj.People;
import com.lesson4.obj.Student;
import com.lesson4.obj.Tourist;

public class Main {
    public static void main(String[] args) {
        Tourist tourist = new Tourist();
        tourist.setId(1);
        tourist.setName("Алексей");
        tourist.setFromCity("Москва");
        tourist.setToCity("Париж");

        Student student = new Student();
        student.setId(1);
        student.setName("Алексей");
        student.setUniversityId(12);

        People p1 = (People) tourist;
        People p2 = (People) student;

        p1.printAboutMe();
        p2.printAboutMe();
    }
}
