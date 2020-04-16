package com.lesson6.obj;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Organization<T> {
    private List<T> list = new ArrayList<>();

    public Collection<T> getPeoples() {
        return list;
    }

    public <A extends T> void addAll(Collection<A> obj) {
        list.addAll(obj);
    }
}
