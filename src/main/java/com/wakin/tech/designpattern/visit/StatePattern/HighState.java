package com.wakin.tech.designpattern.visit.StatePattern;

public class HighState extends AbstractState {
    public HighState(AbstractState state){
        this.context = state.context;
        this.score = state.score;
        stateName = "优秀";
    }

    @Override
    public void checkState() {
        if (score < 60){
            System.out.println("high set low");
            context.setState(new LowState(this));
        }else if(score < 90) {
            System.out.println("high set middle");
            context.setState(new MiddleState(this));
        }
    }
}
