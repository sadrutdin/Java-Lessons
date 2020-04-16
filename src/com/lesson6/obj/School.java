package com.lesson6.obj;

import com.lesson6.obj.subj.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class School extends Organization<Student> {
    private final List<Student> studentList = new ArrayList<>();

    public void add(Student student) {
        studentList.add(student);
    }

    @Override
    public Collection<Student> getPeoples() {
        return studentList;
    }
}
