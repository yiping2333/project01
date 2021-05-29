package com.syp.java;


import java.util.ArrayList;
import java.util.Date;

public class HelloWorld {
    public static void main(String[] args) {
        int num = 10;

        getData();

        //这是单行注释

    }

    public static void getData() {
        System.out.println("oiuoiu ");
        System.out.println("oiuoiu ");
        ArrayList list = new ArrayList();
        Date date = new Date();

        list.add("123");
        System.out.println(list);
        System.out.println(date);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
