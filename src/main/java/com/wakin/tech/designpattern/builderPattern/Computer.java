package com.wakin.tech.designpattern.builderPattern;

import java.util.ArrayList;
import java.util.List;

public class Computer {
    private List<String> parts = new ArrayList<>();

    public void add(String part){
        parts.add(part);
    }

    public void show(){
        for (String part : parts){
            System.out.println("组件" + part + "已经组装好");
        }
        System.out.println("电脑已经组装完成");
    }
}
