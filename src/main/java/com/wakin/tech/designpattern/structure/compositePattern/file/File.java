package com.wakin.tech.designpattern.structure.compositePattern.file;

public abstract class File {
    private String name;

    public File(String name){
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void display();
}
