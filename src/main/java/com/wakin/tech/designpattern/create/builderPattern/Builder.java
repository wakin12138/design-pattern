package com.wakin.tech.designpattern.create.builderPattern;

public abstract class Builder {
    public abstract void buildCPU();
    public abstract void buildMainBord();
    public abstract void buildHD();
    public abstract Computer getComputer();
}
