package com.wakin.tech.designpattern.factoryMethodPattern.factory;

import com.wakin.tech.designpattern.factoryMethodPattern.sender.Sender;

public interface Factory {
    public Sender produceSender();
}
