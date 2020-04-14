package com.lesson4.obj;

public class Student extends People {
    private Integer universityId;

    public Integer getUniversityId() {
        return universityId;
    }

    public void setUniversityId(Integer universityId) {
        this.universityId = universityId;
    }

    @Override
    public void printAboutMe() {
        System.out.println("I'm student. My name is " + getName());
    }
}
