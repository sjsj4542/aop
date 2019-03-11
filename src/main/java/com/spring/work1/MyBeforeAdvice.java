package com.spring.work1;

import org.slf4j.LoggerFactory;

import java.util.logging.Logger;

/**
 * Created by Administrator on 2019/3/7.
 * 用户自定义的前置增强表
 */
public class MyBeforeAdvice {
    private static final org.slf4j.Logger logger= LoggerFactory.getLogger(MyBeforeAdvice.class);
    public void beforeMethod(){
        logger.debug("连接数据库。。。");
    }
}
