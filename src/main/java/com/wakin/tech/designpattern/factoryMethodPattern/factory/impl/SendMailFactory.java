package com.wakin.tech.designpattern.factoryMethodPattern.factory.impl;

import com.wakin.tech.designpattern.factoryMethodPattern.factory.Factory;
import com.wakin.tech.designpattern.factoryMethodPattern.sender.Sender;
import com.wakin.tech.designpattern.factoryMethodPattern.sender.impl.MailSender;

public class SendMailFactory implements Factory {
    @Override
    public Sender produceSender() {
        return new MailSender();
    }
}
