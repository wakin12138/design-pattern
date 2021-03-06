package com.wakin.tech.designpattern.create.singletonPattern.innerClassSingleton;

public class InnerClassSingleton {
    private static class Singleton{
        private static InnerClassSingleton instance  = new InnerClassSingleton();
    }

    private InnerClassSingleton(){}

    public static InnerClassSingleton getInstance(){
        return Singleton.instance;
    }
}
