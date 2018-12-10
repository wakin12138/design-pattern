package com.wakin.tech.designpattern.create.factoryMethodPattern.factory.impl;

import com.wakin.tech.designpattern.create.factoryMethodPattern.factory.Factory;
import com.wakin.tech.designpattern.create.factoryMethodPattern.sender.Sender;
import com.wakin.tech.designpattern.create.factoryMethodPattern.sender.impl.WeChatSender;

public class SendWeChatFactory implements Factory {
    @Override
    public Sender produceSender() {
        return new WeChatSender();
    }
}
