package com.wakin.tech.designpattern.create.abstractFactoryMethodPattern.factory;

import com.wakin.tech.designpattern.create.abstractFactoryMethodPattern.product.AbstractProduct;

public abstract class Factory {
    public abstract AbstractProduct produceChatProduct();
    public abstract AbstractProduct productShopProduct();
}
