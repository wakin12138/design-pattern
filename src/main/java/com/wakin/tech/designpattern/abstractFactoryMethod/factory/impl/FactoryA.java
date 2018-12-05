package com.wakin.tech.designpattern.abstractFactoryMethod.factory.impl;

import com.wakin.tech.designpattern.abstractFactoryMethod.factory.Factory;
import com.wakin.tech.designpattern.abstractFactoryMethod.product.AbstractProduct;
import com.wakin.tech.designpattern.abstractFactoryMethod.product.impl.TaoBaoProduct;
import com.wakin.tech.designpattern.abstractFactoryMethod.product.impl.WeChatProduct;

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
