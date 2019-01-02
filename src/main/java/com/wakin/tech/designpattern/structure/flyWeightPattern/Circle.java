package com.wakin.tech.designpattern.structure.flyWeightPattern;

public class Circle extends Shape {
    private String colour;

    public Circle(String colour){
        this.colour = colour;
    }

    @Override
    public void draw() {
        System.out.println("draw a " + this.colour + " circle");
    }
}
