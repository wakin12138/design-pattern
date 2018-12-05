package com.wakin.tech.designpattern.factoryMethod.factory;

import com.wakin.tech.designpattern.factoryMethod.sender.Sender;

public interface Factory {
    public Sender produceSender();
}
