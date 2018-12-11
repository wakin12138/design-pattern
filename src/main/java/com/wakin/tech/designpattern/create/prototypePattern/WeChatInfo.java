package com.wakin.tech.designpattern.create.prototypePattern;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class WeChatInfo implements Cloneable{
    private String userName;
    private Integer age;
    private List<String> infoList = new ArrayList<>();
    private String[] arr;

    public void setInfoList(List<String> infoList) {
        this.infoList = infoList;
    }

    public void setArr(String[] arr) {
        this.arr = arr;
    }

    public List<String> getInfoList() {
        return infoList;
    }

    public String[] getArr() {
        return arr;
    }

    public WeChatInfo(String userName, int age){
        this.userName = userName;
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        WeChatInfo weChatInfo = (WeChatInfo) super.clone();
        weChatInfo.arr = this.arr.clone();
        return weChatInfo;
    }

    @Override
    public String toString() {
        return "WeChatInfo{" +
                "userName='" + userName + '\'' +
                ", age=" + age +
                ", infoList=" + infoList +
                ", arr=" + Arrays.toString(arr) +
                '}';
    }
}
