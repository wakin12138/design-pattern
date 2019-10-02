package com.wakin.tech.designpattern.visit.TemplateFunction;

import java.util.List;

public class ConcreteClass extends AbstractClass{
    @Override
    public void sort(List<Integer> list) {
        bubbleSort(list);
    }

    public void bubbleSort(List<Integer> list) {
        if (list.size() == 0)
            return;
        for (int i = 0; i < list.size(); i++)
            for (int j = 0; j < list.size() - 1 - i; j++)
                if (list.get(j + 1) < list.get(j)) {
                    int temp = list.get(j + 1);
                    list.set(j + 1, list.get(j));
                    list.set(j, temp);
                }
    }
}
