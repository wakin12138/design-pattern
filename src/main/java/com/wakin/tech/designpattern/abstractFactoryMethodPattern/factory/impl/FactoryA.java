package com.wakin.tech.designpattern.abstractFactoryMethodPattern.factory.impl;

import com.wakin.tech.designpattern.abstractFactoryMethodPattern.factory.Factory;
import com.wakin.tech.designpattern.abstractFactoryMethodPattern.product.AbstractProduct;
import com.wakin.tech.designpattern.abstractFactoryMethodPattern.product.impl.TaoBaoProduct;
import com.wakin.tech.designpattern.abstractFactoryMethodPattern.product.impl.WeChatProduct;

public class FactoryA extends Factory {
    @Override
    public AbstractProduct produceChatProduct() {
        return new WeChatProduct();
    }

    @Override
    public AbstractProduct productShopProduct() {
        return new TaoBaoProduct();
    }
}
