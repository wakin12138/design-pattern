package com.wakin.tech.designpattern.visit.StatePattern;

public class MiddleState extends AbstractState {
    public MiddleState(AbstractState state){
        context = state.context;
        score = state.score;
        stateName = "中等";
    }

    @Override
    public void checkState() {
        if(score < 60){
            System.out.println("middle set low");
            context.setState(new LowState(this));
        }else if(score >= 90){
            System.out.println("middle set high");
            context.setState(new HighState(this));
        }
    }
}
