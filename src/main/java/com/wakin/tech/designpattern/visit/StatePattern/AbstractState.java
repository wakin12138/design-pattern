package com.wakin.tech.designpattern.visit.StatePattern;

public abstract class AbstractState {
    protected ScoreContext context;
    protected String stateName;
    protected int score;
    public abstract void checkState();

    public void addScore(int num){
        score = score + num;
        System.out.println("current score: " + score + ", add: " + num);
        checkState();
        System.out.println("After add: " + score + ", current state: " + context.getState().stateName);
    }
}
