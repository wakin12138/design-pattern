package com.wakin.tech.designpattern.create.abstractFactoryMethodPattern.product.impl;

import com.wakin.tech.designpattern.create.abstractFactoryMethodPattern.product.type.ChatTypeProduct;

public class QqProduct extends ChatTypeProduct {
    @Override
    public void work() {
        System.out.println("this is qq product");
    }
}
