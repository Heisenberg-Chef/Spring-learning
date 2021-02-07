package com.demo2;

public class UserServiceImpl implements UserService{
    @Override
    public void add() {
        System.out.println("+");
    }

    @Override
    public void delete() {
        System.out.println("-");
    }

    @Override
    public void update() {
        System.out.println("R");
    }

    @Override
    public void query() {
        System.out.println("?");
    }
}
