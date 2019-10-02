package com.wakin.tech.designpattern.visit.Mediator;

public class Client {
   public static void main(String[] args){
       Mediator mediator = new Mediator();

       ColleagueA colA = new ColleagueA();
       ColleagueB colB = new ColleagueB();
       colA.setMediator(mediator);
       colB.setMediator(mediator);

       mediator.register(colA);
       mediator.register(colB);

       colA.send();
   }
}
