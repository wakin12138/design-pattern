package com.wakin.tech.designpattern.create.abstractFactoryMethodPattern.factory.impl;

import com.wakin.tech.designpattern.create.abstractFactoryMethodPattern.factory.Factory;
import com.wakin.tech.designpattern.create.abstractFactoryMethodPattern.product.AbstractProduct;
import com.wakin.tech.designpattern.create.abstractFactoryMethodPattern.product.impl.TaoBaoProduct;
import com.wakin.tech.designpattern.create.abstractFactoryMethodPattern.product.impl.WeChatProduct;

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
