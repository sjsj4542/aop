package com.spring.work3;

import com.spring.work3.Tiger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2019/3/11.
 */
public class Application {
    public static void main(String[] args) {
        @SuppressWarnings("rescource")
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Tiger tiger = context.getBean(Tiger.class);
        tiger.walk();
    }
}
