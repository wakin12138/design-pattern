package com.wakin.tech.designpattern.factoryMethodPattern.sender.impl;

import com.wakin.tech.designpattern.factoryMethodPattern.sender.Sender;

public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("this is mail sender");
    }
}
