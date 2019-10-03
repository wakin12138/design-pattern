package com.wakin.tech.designpattern.visit.StatePattern;

public class Client {
    public static void main(String[] args){
        ScoreContext context = new ScoreContext();
        context.addScore(30);
        context.addScore(20);
        context.addScore(30);
        context.addScore(30);
    }
}
