package com.wakin.tech.designpattern.visit.observer;

public class ConcreteSubject extends Subject {
    @Override
    public void notifyObservers() {
        for(Observer observer : observerList){
            observer.response();
        }
    }
}
