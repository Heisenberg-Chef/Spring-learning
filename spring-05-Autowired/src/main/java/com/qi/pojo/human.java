package com.qi.pojo;

import org.springframework.beans.factory.annotation.Autowired;

public class human {
    @Autowired
    private cat cat;
    @Autowired
    private dog dog;
    private String name;

    @Override
    public String toString() {
        return "human{" +
                "cat=" + cat +
                ", dog=" + dog +
                ", name='" + name + '\'' +
                '}';
    }

    public com.qi.pojo.cat getCat() {
        return cat;
    }

    public void setCat(com.qi.pojo.cat cat) {
        this.cat = cat;
    }

    public com.qi.pojo.dog getDog() {
        return dog;
    }

    public void setDog(com.qi.pojo.dog dog) {
        this.dog = dog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
