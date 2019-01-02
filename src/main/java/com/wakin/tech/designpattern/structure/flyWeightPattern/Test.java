package com.wakin.tech.designpattern.structure.flyWeightPattern;

import sun.security.provider.SHA;

public class Test {
    public static void main(String[] args){
        Shape shape1 = FlyweightFactory.getShape("red");
        shape1.draw();

        Shape shape2 = FlyweightFactory.getShape("white");
        shape2.draw();

        Shape shape3 = FlyweightFactory.getShape("green");
        shape3.draw();

        Shape shape4 = FlyweightFactory.getShape("blue");
        shape3.draw();

        Shape shape5 = FlyweightFactory.getShape("blue");
        shape5.draw();

        System.out.println(FlyweightFactory.getSum());
    }
}
