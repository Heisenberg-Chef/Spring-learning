package com.demo01;

public class client {
    public static void main(String[] args) {
        proxy p = new proxy(new host());
        p.rent();// 多了一层关系 ,中介可以带你看房,我们将中介写入这个类
    }
}
