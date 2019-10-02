package com.wakin.tech.designpattern.visit.Mediator;


public class ColleagueA extends AbatractColleague {
    @Override
    public void recive() {
        System.out.println("colleagueA receive msg");
    }

    @Override
    public void send() {
        System.out.println("colleagueA send msg");
        this.mediator.relay(this);
    }
}
