package com.wakin.tech.designpattern.structure.decoratorPattern;

public class Test {
    public static void main(String[] args){
        Painting painting = new MonsLisa();
        Painting monalisa = new Decorator(painting);

        monalisa.show();
    }
}
