package com.wakin.tech.designpattern.create.abstractFactoryMethodPattern.product.impl;

import com.wakin.tech.designpattern.create.abstractFactoryMethodPattern.product.type.ShopTypeProduct;

public class TaoBaoProduct extends ShopTypeProduct {
    @Override
    public void work() {
        System.out.println("this is taobao product");
    }
}
