package com.wakin.tech.designpattern.visit.TemplateFunction;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args){
        ConcreteClass con = new ConcreteClass();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(6);
        list.add(9);
        list.add(8);
        list.add(5);
        list.add(4);
        con.print(list);
    }
}
