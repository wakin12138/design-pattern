package com.wakin.tech.designpattern.create.abstractFactoryMethodPattern.product.impl;

import com.wakin.tech.designpattern.create.abstractFactoryMethodPattern.product.type.ChatTypeProduct;

public class WeChatProduct extends ChatTypeProduct {
    @Override
    public void work() {
        System.out.println("this is wechat product");
    }
}
