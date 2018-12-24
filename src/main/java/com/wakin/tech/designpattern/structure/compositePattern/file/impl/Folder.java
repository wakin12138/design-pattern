package com.wakin.tech.designpattern.structure.compositePattern.file.impl;

import com.wakin.tech.designpattern.structure.compositePattern.file.File;

import java.util.ArrayList;
import java.util.List;

public class Folder extends File {
    private List<File> files;

    public Folder(String name) {
        super(name);
        this.files = new ArrayList<>();
    }

    @Override
    public void display() {
        for(File file : files){
            file.display();
        }
    }

    public void add(File file){this.files.add(file);}

    public void delete(File file){this.files.add(file);}
}
