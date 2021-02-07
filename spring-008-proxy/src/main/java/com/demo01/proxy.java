package com.demo01;

public class proxy implements Rent{

    private host host;

    public proxy()
    {

    }

    public proxy(host host)
    {
        this.host = host;
    }


    @Override
    public void rent() {
        host.rent();
    }

    public void seeHouse()
    {
        System.out.println("中介带你看房");
    }

    public void fare()
    {
        System.out.println("收中介费");
    }
}
