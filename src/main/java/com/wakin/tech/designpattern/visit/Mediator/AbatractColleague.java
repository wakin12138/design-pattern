package com.wakin.tech.designpattern.visit.Mediator;

public abstract class AbatractColleague {
    protected AbstractMediator mediator;

    public void setMediator(AbstractMediator mediator){
        this.mediator = mediator;
    }

    public abstract void recive();

    public abstract void send();

}
