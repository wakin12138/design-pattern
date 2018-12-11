package com.wakin.tech.designpattern.structure.adaptorPattern.classAdaptPattern;

public class AdaptorTest {
    public static void main(String[] args){
        Target target = new Adaptor();
        target.request();
    }
}
