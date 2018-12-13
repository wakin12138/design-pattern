package com.wakin.tech.designpattern.structure.proxyPattern;

public class Test {
    public static void main(String[] args){
        Home home = new Intermediary();
        home.selectHome();
    }
}
