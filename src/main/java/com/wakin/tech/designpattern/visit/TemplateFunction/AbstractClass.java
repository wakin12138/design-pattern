package com.wakin.tech.designpattern.visit.TemplateFunction;

import java.util.List;

public abstract class AbstractClass {
    //模板方法
    public abstract void sort(List<Integer> list);

    public void print(List<Integer> list){
        this.sort(list);
        for(Integer num : list){
            System.out.println(num);
        }
    }
}
