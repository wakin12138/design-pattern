package com.wakin.tech.designpattern.create.singletonPattern.hungryMan;

/**
 * 类加载时创建实例
 */
public class HungryManSingleton {
    private static HungryManSingleton instance = new HungryManSingleton();

    private HungryManSingleton(){}

    public static HungryManSingleton getInstance(){
        return instance;
    }
}
