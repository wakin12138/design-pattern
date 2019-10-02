package com.wakin.tech.designpattern.visit.observer;

public class ConcreteObserverA implements Observer {
    @Override
    public void response() {
        System.out.println("A reposense");
    }
}
