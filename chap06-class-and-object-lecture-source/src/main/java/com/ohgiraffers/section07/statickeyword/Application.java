package com.ohgiraffers.section07.statickeyword;

public class Application {
    public static void main(String[] args) {
        StaticFieldTest staticFieldTest1 = new StaticFieldTest();

        staticFieldTest1.increaseNonStaticCount();
        staticFieldTest1.increaseStaticCount();

        System.out.println("non : " + staticFieldTest1.getNonStaticCount());
        System.out.println("static : " + staticFieldTest1.getStaticCount());

        StaticFieldTest staticFieldTest2 = new StaticFieldTest();
        staticFieldTest2.increaseNonStaticCount();
        staticFieldTest2.increaseStaticCount();

        System.out.println("non : " + staticFieldTest2.getNonStaticCount());
        System.out.println("static : " + staticFieldTest2.getStaticCount());
    }
}
