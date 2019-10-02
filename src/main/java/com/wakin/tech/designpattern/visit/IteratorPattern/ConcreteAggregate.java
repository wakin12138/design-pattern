package com.wakin.tech.designpattern.visit.IteratorPattern;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate implements Aggregate {
    List list = new ArrayList();

    @Override
    public void add(Object obj) {
        list.add(obj);
    }

    @Override
    public void remove(Object obj) {
        list.remove(obj);
    }

    @Override
    public Itrator iterator() {
        return new ConcreteIterator(list);
    }
}
