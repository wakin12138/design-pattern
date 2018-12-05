package com.wakin.tech.designpattern.abstractFactoryMethod.product.impl;

import com.wakin.tech.designpattern.abstractFactoryMethod.product.type.ShopTypeProduct;

public class TaoBaoProduct extends ShopTypeProduct {
    @Override
    public void work() {
        System.out.println("this is taobao product");
    }
}
