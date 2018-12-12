package com.wakin.tech.designpattern.structure.decoratorPattern;

public class Decorator implements Painting {
    private Painting painting;

    public Decorator (Painting painting){
        this.painting = painting;
    }

    @Override
    public void show() {
        System.out.println("this is added words");
        painting.show();
        System.out.println("add over");
    }
}
