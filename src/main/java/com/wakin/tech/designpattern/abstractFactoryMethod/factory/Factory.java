package com.wakin.tech.designpattern.abstractFactoryMethod.factory;

import com.wakin.tech.designpattern.abstractFactoryMethod.product.AbstractProduct;

public abstract class Factory {
    public abstract AbstractProduct produceChatProduct();
    public abstract AbstractProduct productShopProduct();
}
