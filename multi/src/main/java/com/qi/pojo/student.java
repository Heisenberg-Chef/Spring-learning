package com.qi.pojo;

import lombok.Data;

@Data
public class student {
    private int id;
    private String name;
    private int pid;
    private teacher teacher;
}
