package com.wakin.tech.designpattern.structure.facadePattern;

public class Test {
    public static void main(String[] args){
        Mobile mobile = new Mobile(new ChatApp(), new MapApp(), new ShopApp());
        mobile.on();
        mobile.off();
    }
}
