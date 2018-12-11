package com.wakin.tech.designpattern.structure.adaptorPattern;

public class AdaptorTest {
    public static void main(String[] args){
        Target target = new Adaptor();
        target.request();
    }
}
