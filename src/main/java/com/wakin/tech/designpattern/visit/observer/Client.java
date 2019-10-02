package com.wakin.tech.designpattern.visit.observer;

public class Client {
    public static void main(String[] args){
        Subject subject = new ConcreteSubject();
        Observer oba = new ConcreteObserverA();
        Observer obb = new ConcreteObserverB();
        subject.add(oba);
        subject.add(obb);
        subject.notifyObservers();
    }
}
