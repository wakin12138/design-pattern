package com.wakin.tech.designpattern.structure.compositePattern.file.impl;

import com.wakin.tech.designpattern.structure.compositePattern.file.File;

public class TextFile extends File {
    public TextFile(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("this is text file, name is " + super.getName());
    }
}
