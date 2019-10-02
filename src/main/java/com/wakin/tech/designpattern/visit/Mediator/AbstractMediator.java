package com.wakin.tech.designpattern.visit.Mediator;

public abstract class AbstractMediator {
    public abstract void register(AbatractColleague colleague);

    public abstract void relay(AbatractColleague colleague);
}
