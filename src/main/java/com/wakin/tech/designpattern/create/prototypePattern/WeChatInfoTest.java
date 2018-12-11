package com.wakin.tech.designpattern.create.prototypePattern;

import java.util.ArrayList;
import java.util.List;

public class WeChatInfoTest {
    public static void main(String[] args){
        WeChatInfo weChatInfo = new WeChatInfo("xiaowang", 11);
        List<String> list = new ArrayList<>();
        weChatInfo.setInfoList(list);
        weChatInfo.setArr(new String[1]);
        WeChatInfo weChatInfo1 = null;
        try {
            weChatInfo1 = (WeChatInfo) weChatInfo.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println(weChatInfo1.toString());
        System.out.println("===> we arr address: " + weChatInfo.getArr());
        System.out.println("===> we1 arr address: " + weChatInfo1.getArr());
    }
}
