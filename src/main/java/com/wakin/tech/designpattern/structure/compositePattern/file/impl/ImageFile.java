package com.wakin.tech.designpattern.structure.compositePattern.file.impl;

import com.wakin.tech.designpattern.structure.compositePattern.file.File;

public class ImageFile extends File {
    public ImageFile(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("this is image file, name is " + super.getName());
    }
}
