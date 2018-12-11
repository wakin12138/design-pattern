package com.wakin.tech.designpattern.structure.adaptorPattern.objectAdaptPattern;

public class Adaptor implements Target {
    private Adaptee adaptee;

    public Adaptor(Adaptee adaptee){
        this.adaptee = adaptee;
    }
    @Override
    public void request() {
        adaptee.sepecficRequest();
    }
}
