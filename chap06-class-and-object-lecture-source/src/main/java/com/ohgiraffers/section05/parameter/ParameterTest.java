package com.ohgiraffers.section05.parameter;

import java.util.Arrays;

public class ParameterTest {

    /* 1. 기본 자료형 */
    public int testPrimaryTypeParameter(int num) {
        num += 10;
        System.out.println("testPrimaryTypeParameter num : " + num);
        return num;
    }

    public void testPrimaryTypeParameter(int[] arr) {
        arr[0] = 99;
        System.out.println("testPrimaryTypeParameter arr[0] : " + arr[0]);
    }

    public void testClassTypeParameter(Rectangle rectangle) {
        rectangle.setWidth(32.5);
        rectangle.setHeight(42.5);
        System.out.println(rectangle);
    }

    public void testVariableLengthArrayParameter(String name, String ... hobby) {
        System.out.println("name : " + name);
        System.out.println("hobby length : " + hobby.length);
        System.out.println("취미 : " + Arrays.toString(hobby));
    }

    // public void testVariableLengthArrayParameter(String ... hobby) {}
}
