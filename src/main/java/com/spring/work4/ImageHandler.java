package com.spring.work4;

import cn.hutool.core.util.ImageUtil;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.*;
import java.io.File;
import org.slf4j.LoggerFactory;

/**
 * Created by lenovo on 2019/3/11.
 */
@Aspect
public class ImageHandler {
    private static final Logger logger= LoggerFactory.getLogger(ImageHandler.class);
    @Pointcut("execution(* com.spring.work4.ImageCopy.copyImage())")
    public void handleImage(){

    }
    @Before(value="handleImage()")
    public void pressTextOnImage(){
        logger.info("开始给图片添加水印");
        File srcFile=new File("D:/db1.jpg");
        File destFile=new File("D:/db2.jpg");
        Color color=new Color(211,71,38);

        Font font=new Font("微软雅黑",Font.BOLD,60);
        ImageUtil.pressText(srcFile,destFile,"Spring Aop",color,font,200,350,1.0f);
    }
    @AfterReturning("handleImage()")
    public void grayImage(){
        logger.info("开始将图片转成黑白");
        File srcFile=new File("D:/db2.jpg");
        File destFile=new File("E:/db3.jpg");
        ImageUtil.gray(srcFile,destFile);
    }
}
