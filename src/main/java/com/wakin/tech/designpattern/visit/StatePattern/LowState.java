package com.wakin.tech.designpattern.visit.StatePattern;

import com.wakin.tech.designpattern.visit.TemplateFunction.AbstractClass;

public class LowState extends AbstractState {
    public LowState(ScoreContext h)
    {
        context = h;
        stateName="不及格";
        score=0;
    }
    public LowState(AbstractState state)
    {
        context=state.context;
        stateName="不及格";
        score=state.score;
    }
    @Override
    public void checkState() {
        if(score>=90)
        {
            System.out.println("low set high");
            context.setState(new HighState(this));
        }
        else if(score>=60)
        {
            System.out.println("low set middle");
            context.setState(new MiddleState(this));
        }
    }
}
