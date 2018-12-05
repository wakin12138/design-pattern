package com.wakin.tech.designpattern.factoryMethod.sender.impl;

import com.wakin.tech.designpattern.factoryMethod.sender.Sender;

public class WeChatSender implements Sender {
    @Override
    public void send() {
        System.out.println("this id wechat sender");
    }
}
