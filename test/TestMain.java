package com.test;

public class TestMain {
    String name = "deva";
    int id =234;

    public void m1() {
        String age = null;
        System.out.println("name ::"+name+"::id::"+id+"age::"+age);

    }

    public static void main(String[] args) {
        TestMain testMain = new TestMain();
        testMain.m1();
    }
}
