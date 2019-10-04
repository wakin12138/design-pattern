package com.wakin.tech.designpattern.visit.Strategy;

public class StrategyA implements Strategy {
    @Override
    public void doAction() {
        System.out.println("do action for strategy a");
    }
}
