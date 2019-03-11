package com.spring.work4;

import com.spring.work3.Tiger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.*;
import java.io.IOException;

/**
 * Created by lenovo on 2019/3/11.
 */
public class ImageCopyApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        ImageCopy imageCopy = context.getBean(ImageCopy.class);
        try{
            imageCopy.copyImage();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
