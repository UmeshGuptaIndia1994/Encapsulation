package com.driver;

public class Main {
    public static void main(String[] args){
        com.driver.RWOnly obj = new com.driver.RWOnly();
        obj.setName("name");
        System.out.println(obj.getName());
    }
}
