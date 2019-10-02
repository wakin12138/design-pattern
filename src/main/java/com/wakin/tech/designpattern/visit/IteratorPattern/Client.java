package com.wakin.tech.designpattern.visit.IteratorPattern;

public class Client {
    public static void main(String[] args){
        Aggregate aggregate = new ConcreteAggregate();
        aggregate.add("1");
        aggregate.add("2");
        aggregate.add("3");
        Itrator it = aggregate.iterator();
        while (it.hasNext()){
            String str = (String)it.next();
            System.out.println(str);
        }
    }
}
