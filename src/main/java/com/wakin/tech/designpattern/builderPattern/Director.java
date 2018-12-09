package com.wakin.tech.designpattern.builderPattern;

public class Director {
    public void construct(Builder builder){
        builder.buildCPU();
        builder.buildMainBord();
        builder.buildHD();
    }
}
