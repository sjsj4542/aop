package com.spring.work3;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by lenovo on 2019/3/11.
 */
@Aspect
public class Fighter {
    @Pointcut("execution(* com.spring.work3.Tiger.walk())")
    public void foundTiger(){

    }
    @Before(value="foundTiger()")
    public void foundBefore(){
        System.out.println("Fight wait for the tiger");
    }
    @AfterReturning("foundTiger()")
    public void foundAfter(){
        System.out.println("fighter fight with tiger");
    }
}
