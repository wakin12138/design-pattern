package com.wakin.tech.designpattern.create.factoryMethodPattern.factory;

import com.wakin.tech.designpattern.create.factoryMethodPattern.sender.Sender;

public interface Factory {
    public Sender produceSender();
}
