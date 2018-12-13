package com.wakin.tech.designpattern.structure.proxyPattern;

public class Intermediary implements Home {
    private Custom custom;

    public Intermediary(){
        this.custom = new Custom();
    }

    @Override
    public void selectHome() {
        before();
        custom.selectHome();
        after();
    }

    private void before() {
        System.out.println("before method");
    }

    private void after(){
        System.out.println("after method");
    }
}
