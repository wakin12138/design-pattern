package com.wakin.tech.designpattern.abstractFactoryMethodPattern.factory.impl;

import com.wakin.tech.designpattern.abstractFactoryMethodPattern.factory.Factory;
import com.wakin.tech.designpattern.abstractFactoryMethodPattern.product.AbstractProduct;
import com.wakin.tech.designpattern.abstractFactoryMethodPattern.product.impl.JingdongProduct;
import com.wakin.tech.designpattern.abstractFactoryMethodPattern.product.impl.QqProduct;

public class FactoryB extends Factory {
    @Override
    public AbstractProduct produceChatProduct() {
        return new QqProduct();
    }

    @Override
    public AbstractProduct productShopProduct() {
        return new JingdongProduct();
    }
}
