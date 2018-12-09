package com.wakin.tech.designpattern.builderPattern;

public class BuilderPatternTest {
    public static void main(String[] args){
        Director director = new Director();
        Builder builder = new ConcreteBuilder();
        director.construct(builder);
        Computer  computer = builder.getComputer();
        computer.show();
    }
}
