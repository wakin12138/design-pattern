package com.wakin.tech.designpattern.visit.Mediator;

import java.util.ArrayList;
import java.util.List;

public class Mediator extends AbstractMediator {
    List<AbatractColleague> colleagueList = new ArrayList<>();

    @Override
    public void register(AbatractColleague colleague) {
        if(!colleagueList.contains(colleague)){
            this.colleagueList.add(colleague);
        }
    }

    @Override
    public void relay(AbatractColleague colleague) {
        for(AbatractColleague col : colleagueList){
            if(!col.equals(colleague)){
                col.recive();
            }
        }
    }
}
