package com.spring;

/**
 * Created by lenovo on 2019/3/7.
 */
public class tankPoxy implements Move {
    private  Move t;
    public  tankPoxy(Move t){
        this.t=t;
    }

    @Override
    public void move() {
        System.out.print("attack");
        t.move();
        System.out.print("bomb");

    }
}
