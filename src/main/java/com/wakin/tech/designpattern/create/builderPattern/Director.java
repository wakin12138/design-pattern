package com.wakin.tech.designpattern.create.builderPattern;

public class Director {
    public void construct(Builder builder){
        builder.buildCPU();
        builder.buildMainBord();
        builder.buildHD();
    }
}
