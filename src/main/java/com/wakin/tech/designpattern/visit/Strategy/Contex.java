package com.wakin.tech.designpattern.visit.Strategy;

public class Contex {
    private Strategy strategy;

    public void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }

    public void doStrategyAction(){
        strategy.doAction();
    }
}
