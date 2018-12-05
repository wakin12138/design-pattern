package com.wakin.tech.designpattern.factoryMethod;

import com.wakin.tech.designpattern.factoryMethod.factory.Factory;
import com.wakin.tech.designpattern.factoryMethod.factory.impl.SendMailFactory;
import com.wakin.tech.designpattern.factoryMethod.sender.Sender;

/**
 * step1: 创建抽象产品类，定义产品的公共接口方法
 * step2：创建抽抽象工厂类，定义产生产品的公共接口方法
 * step3：创建具体产品类，继承抽象产品类，实现产品的具体方法
 * step4：创建具体工厂类，继承抽象工厂类，实现产生具体产品的方法
 * step5：使用时候通过调用具体工厂类的方法，来创建具体产品实例
 */
public class TestFactoryMethod {
    public static void main(String[] args){
        Factory factory = new SendMailFactory();
        Sender sender = factory.produceSender();
        sender.send();
    }
}
