package com.wakin.tech.designpattern.create.builderPattern;

public class ConcreteBuilder extends Builder {
    private Computer computer = new Computer();

    @Override
    public void buildCPU() {
        computer.add("CPU");
    }

    @Override
    public void buildMainBord() {
        computer.add("main bord");
    }

    @Override
    public void buildHD() {
        computer.add("HD");
    }

    @Override
    public Computer getComputer() {
        return this.computer;
    }
}
