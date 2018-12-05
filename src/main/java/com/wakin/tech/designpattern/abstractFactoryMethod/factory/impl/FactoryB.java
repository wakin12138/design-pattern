package com.wakin.tech.designpattern.abstractFactoryMethod.factory.impl;

import com.wakin.tech.designpattern.abstractFactoryMethod.factory.Factory;
import com.wakin.tech.designpattern.abstractFactoryMethod.product.AbstractProduct;
import com.wakin.tech.designpattern.abstractFactoryMethod.product.impl.JingdongProduct;
import com.wakin.tech.designpattern.abstractFactoryMethod.product.impl.QqProduct;

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
