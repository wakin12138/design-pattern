package com.wakin.tech.designpattern.abstractFactoryMethod;

import com.wakin.tech.designpattern.abstractFactoryMethod.factory.impl.FactoryA;
import com.wakin.tech.designpattern.abstractFactoryMethod.factory.impl.FactoryB;

/**
 * step1: 创建抽象产品类，定义产品的接口
 * step2：创建抽象产品类别类，
 * step3：创建具体产品类
 * step4：创建抽象工厂类
 *  step5：创建具体工厂类
 *  step6：实例化不同的具体的工厂类，工厂实例能够创建属于不同产品类别的产品
 */
public class TestAbstractFactoryMethod {
    public static void main(String[] args){
        FactoryA factoryA = new FactoryA();
        FactoryB factoryB = new FactoryB();

        factoryA.produceChatProduct().work();
        factoryA.productShopProduct().work();
        factoryB.produceChatProduct().work();
        factoryB.productShopProduct().work();
    }
}
