package com.demo0;

import java.util.Arrays;

public class multi {
    public void func(Object...args)
    {

        System.out.println(Arrays.stream(args).toArray());
    }

    public static void main(String[] args) {
        new multi().func("a",1,3.14);
    }
}
