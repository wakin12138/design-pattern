package com.wakin.tech.designpattern.abstractFactoryMethod.product.impl;

import com.wakin.tech.designpattern.abstractFactoryMethod.product.type.ChatTypeProduct;

public class QqProduct extends ChatTypeProduct {
    @Override
    public void work() {
        System.out.println("this is qq product");
    }
}
