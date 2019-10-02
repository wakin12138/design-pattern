package com.wakin.tech.designpattern.visit.IteratorPattern;

public interface Aggregate {
    public void add(Object obj);
    public void remove(Object obj);
    public Itrator iterator();
}
