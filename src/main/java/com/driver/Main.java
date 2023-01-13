package com.driver;

public class Main {
    public static void main(String args[]){
        RWOnly obj=new RWOnly();

        obj.setName("Java");
        System.out.println(obj.getName());
    }
}