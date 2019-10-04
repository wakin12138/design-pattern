package com.wakin.tech.designpattern.visit.Strategy;

public class Client {
    public static void main(String[] args){
        Contex contex = new Contex();
        Strategy strategyA = new StrategyA();
        contex.setStrategy(strategyA);
        contex.doStrategyAction();
        Strategy strategyB = new StrategyB();
        contex.setStrategy(strategyB);
        contex.doStrategyAction();
    }
}
