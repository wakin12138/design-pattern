package com.wakin.tech.designpattern.abstractFactoryMethodPattern.factory;

import com.wakin.tech.designpattern.abstractFactoryMethodPattern.product.AbstractProduct;

public abstract class Factory {
    public abstract AbstractProduct produceChatProduct();
    public abstract AbstractProduct productShopProduct();
}
