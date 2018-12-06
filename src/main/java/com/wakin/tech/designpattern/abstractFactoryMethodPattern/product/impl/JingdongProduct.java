package com.wakin.tech.designpattern.abstractFactoryMethodPattern.product.impl;

import com.wakin.tech.designpattern.abstractFactoryMethodPattern.product.type.ShopTypeProduct;

public class JingdongProduct extends ShopTypeProduct {
    @Override
    public void work() {
        System.out.println("this is jingdong product");
    }
}
