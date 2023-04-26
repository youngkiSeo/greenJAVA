package com.green.java.ch07.ArrayList;

import java.util.Arrays;

public class MyArrayList {
    private int [] items;


    MyArrayList(){
        this.items= new int[0] ;
       // System.out.println(items.length);
    }


    public void add(int num) {
        int [] temp = new int [items.length+1];
        for (int i = 0; i < items.length; i++) {
            temp[i] = items[i];
        }
        temp[items.length]= num;
        items=temp;
    }
    public void add(int num1, int num2){
        int [] temp = new int[items.length+1];

//        for (int i = 0; i <=items.length; i++) {
//            if (i < num1) {
//                temp[i] = items[i];
//            } else if (i == num1) {
//                temp[i] = num2;
//            } else {
//                temp[i] = items[i - 1];
//            }
//        }

        if (num1>items.length){
            System.out.println("오류발생");
            return;
        }

        temp[num1]=num2;
        for (int i = 0; i<items.length; i++) {
            if (i < num1) {
                temp[i] = items[i];
            } else {
                temp[i + 1] = items[i];
            }
        }
        items=temp;
    }
    @Override
    public String toString(){
        String str = "["+items[0];
        for (int i = 1; i <items.length; i++) {
            str+=", "+items[i];
        }
        str+="]";
        return str;
    }
}