package com.wakin.tech.designpattern.visit.StatePattern;

public class ScoreContext {
    private AbstractState state;

    public ScoreContext(){
        state = new LowState(this);
    }

    public void setState(AbstractState state){
        this.state = state;
    }

    public AbstractState getState(){
        return this.state;
    }

    public void addScore(int num){
        state.addScore(num);
    }
}
