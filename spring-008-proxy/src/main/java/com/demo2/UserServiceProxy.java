package com.demo2;

public class UserServiceProxy implements UserService{

    private  UserServiceImpl userService;
    public UserServiceProxy(UserServiceImpl Impl)
    {
        this.userService = Impl;
    }

    @Override
    public void add() {
        /**
         * 这样可以不改变原有的代码.
         */
        System.out.println("add something");
        userService.add();
    }

    @Override
    public void delete() {

    }

    @Override
    public void update() {

    }

    @Override
    public void query() {

    }

    public void log()
    {
        System.out.println("[debug] ...");
    }
}
