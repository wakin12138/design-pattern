package com.wakin.tech.designpattern.create.prototypePattern;

import java.util.ArrayList;
import java.util.List;

public class WeChatInfo implements Cloneable{
    private String userName;
    private Integer age;
    private List<String> infoList = new ArrayList<>();
    private String[] arr;

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
}
