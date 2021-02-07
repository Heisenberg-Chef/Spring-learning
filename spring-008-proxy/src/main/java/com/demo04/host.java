package com.demo04;


/**
 * 房东
 */
public class host implements Rent {

    @Override
    public void rent() {
        System.out.println("房东出租房子");
    }
}
