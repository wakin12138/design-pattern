package com.wakin.tech.designpattern.structure.facadePattern;

public class Mobile {
    private ChatApp chatApp;
    private MapApp mapApp;
    private ShopApp shopApp;

    public Mobile(ChatApp chatApp, MapApp mapApp, ShopApp shopApp){
        this.chatApp = chatApp;
        this.mapApp = mapApp;
        this.shopApp = shopApp;
    }

    public void on(){
        this.chatApp.on();
        this.mapApp.on();
        this.shopApp.on();
    }

    public void off(){
        this.chatApp.off();
        this.mapApp.off();
        this.shopApp.off();
    }
}
