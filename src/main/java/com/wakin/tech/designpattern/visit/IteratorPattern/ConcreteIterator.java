package com.wakin.tech.designpattern.visit.IteratorPattern;

import java.util.ArrayList;
import java.util.List;

public class ConcreteIterator implements Itrator {
    private List list = new ArrayList();

    private int index = 0;

    public ConcreteIterator(List list){
        this.list = list;
    }

    @Override
    public Object next() {
        Object object = null;
        if(this.hasNext()){
            object = list.get(index++);
        }
        return object;
    }

    @Override
    public boolean hasNext() {
        if(index == list.size()){
            return false;
        }
        return true;
    }
}
