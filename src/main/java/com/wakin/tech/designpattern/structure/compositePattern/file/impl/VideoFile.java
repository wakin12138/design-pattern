package com.wakin.tech.designpattern.structure.compositePattern.file.impl;

import com.wakin.tech.designpattern.structure.compositePattern.file.File;

public class VideoFile extends File {
    public VideoFile(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("this is video file, name is " + super.getName());
    }
}
