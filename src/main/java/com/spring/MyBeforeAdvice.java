package com.spring;

import java.util.logging.Logger;

/**
 * Created by lenovo on 2019/3/7.
 * 用户自定义的牵制增强类
 */
public class MyBeforeAdvice {

    //定义前置方法
    public void beforeMethod(){
       System.out.print("this is a before method");
    }
}
