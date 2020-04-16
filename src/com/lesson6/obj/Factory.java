package com.lesson6.obj;

import com.lesson6.obj.subj.Employer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Factory extends Organization<Employer> {
    private final List<Employer> employerList = new ArrayList<>();

    public void add(Employer employer) {
        employerList.add(employer);
    }

    @Override
    public Collection<Employer> getPeoples() {
        return employerList;
    }
}
