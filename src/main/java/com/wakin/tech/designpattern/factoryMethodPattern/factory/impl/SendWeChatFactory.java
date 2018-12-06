package com.wakin.tech.designpattern.factoryMethodPattern.factory.impl;

import com.wakin.tech.designpattern.factoryMethodPattern.factory.Factory;
import com.wakin.tech.designpattern.factoryMethodPattern.sender.Sender;
import com.wakin.tech.designpattern.factoryMethodPattern.sender.impl.WeChatSender;

public class SendWeChatFactory implements Factory {
    @Override
    public Sender produceSender() {
        return new WeChatSender();
    }
}
