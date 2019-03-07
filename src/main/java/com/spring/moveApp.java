package com.spring;

/**
 * Created by lenovo on 2019/3/7.
 */
public class moveApp {
    public static void main(String[] args) {
        Move t1=new tank();
        Move moveProxy=new tankPoxy(t1);
        moveProxy.move();
    }
}
