package com.wakin.tech.designpattern.structure.compositePattern;

import com.wakin.tech.designpattern.structure.compositePattern.file.impl.Folder;
import com.wakin.tech.designpattern.structure.compositePattern.file.impl.ImageFile;
import com.wakin.tech.designpattern.structure.compositePattern.file.impl.TextFile;
import com.wakin.tech.designpattern.structure.compositePattern.file.impl.VideoFile;

public class Test {
    public static void main(String[] args){
        Folder rootFolder = new Folder("Root Folder");
        TextFile aText = new TextFile("a.txt");
        ImageFile bImag = new ImageFile("b.jpg");
        Folder cFolder = new Folder("c folder");

        rootFolder.add(aText);
        rootFolder.add(bImag);
        rootFolder.add(cFolder);

        cFolder.add(new TextFile("c_1.txt"));
        cFolder.add(new ImageFile("c_1.jpg"));
        VideoFile c1VideoFile = new VideoFile("c_1.rmvb");
        cFolder.add(c1VideoFile);

        cFolder.display();
        cFolder.delete(c1VideoFile);
        System.out.println("=================");
        cFolder.display();
        System.out.println("===================");
        rootFolder.display();
    }
}
