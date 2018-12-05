package com.wakin.tech.designpattern.factoryMethod.factory.impl;

import com.wakin.tech.designpattern.factoryMethod.factory.Factory;
import com.wakin.tech.designpattern.factoryMethod.sender.Sender;
import com.wakin.tech.designpattern.factoryMethod.sender.impl.MailSender;

public class SendMailFactory implements Factory {
    @Override
    public Sender produceSender() {
        return new MailSender();
    }
}
