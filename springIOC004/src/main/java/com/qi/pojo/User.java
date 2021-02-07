package com.qi.pojo;

import lombok.Data;

import java.util.Objects;
@Data
public class User {
    private String name;

    public User(String name) {
        this.name = name;
        System.out.println("有参构造方法被调用");
    }

    public User() {
        System.out.println("User 的 无参构造.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show()
    {
        System.out.println("name = "+this.name);
    }
}
