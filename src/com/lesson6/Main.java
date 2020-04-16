package com.lesson6;

import com.lesson6.obj.Factory;
import com.lesson6.obj.Organization;
import com.lesson6.obj.School;
import com.lesson6.obj.subj.Employer;
import com.lesson6.obj.subj.People;
import com.lesson6.obj.subj.Student;

public class Main {
    public static void main(String[] args) {
        Organization<People> city = new Organization<>();
        School school = new School();
        Organization<Employer> factory = new Factory();

        city.getPeoples().add(new People());
        school.getPeoples().add(new Student());
        factory.getPeoples().add(new Employer());

        System.out.println(city.getPeoples());
        System.out.println(school.getPeoples());
        System.out.println(factory.getPeoples());
    }

    private static <T> T printAndReturn(T o) {
        System.out.println(o);
        return o;
    }
}
