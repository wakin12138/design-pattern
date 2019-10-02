package com.wakin.tech.designpattern.visit.Mediator;

public class ColleagueB extends AbatractColleague {
    @Override
    public void recive() {
        System.out.println("colleagueB receive msg");
    }

    @Override
    public void send() {
        System.out.println("colleagueB send msg");
        this.mediator.relay(this);

    }
}
