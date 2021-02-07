package com.demo3;

/**
 * 房东
 */
public class host implements Rent {

    @Override
    public void rent() {
        System.out.println("房东出租房子");
    }

    public void seeHouse()
    {
        System.out.println("中介带着看房子.");
    }
}
