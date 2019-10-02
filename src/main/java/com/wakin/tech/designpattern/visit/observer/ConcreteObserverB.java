package com.wakin.tech.designpattern.visit.observer;

public class ConcreteObserverB implements Observer {
    @Override
    public void response() {
        System.out.println("B response");
    }
}
