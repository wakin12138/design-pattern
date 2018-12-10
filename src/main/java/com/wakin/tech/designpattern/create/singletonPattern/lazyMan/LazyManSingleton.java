package com.wakin.tech.designpattern.create.singletonPattern.lazyMan;

/**
 * 在调用单例是才创建实例
 */
public class LazyManSingleton {
    private LazyManSingleton instance = null;

    private LazyManSingleton(){}

    public LazyManSingleton getInstance(){
        //双重校验
        if(instance == null){
            synchronized (LazyManSingleton.class){
                if (instance == null){
                    instance = new LazyManSingleton();
                }
            }
        }
        return instance;
    }
}
