package com.ohgiraffers.section05.overloading;

public class OverloadingTest {
    /* 오버로딩 : 같은 클래스 내에서 같은 이름의 메소드를 매개변수부만 다르게하여 작성하는 것
    * 오버로딩 사용 이유
    * 매개변수의 종류별로 메소드 내용을 다르게 작성해야하는 경우가 종종 있는데,
    * 동일 기능의 메소드를 매개변수에 따른 이름을 붙으면 관리가 어려워지기 때문
    * */
    public static void main(String[] args) {
        System.out.println();
    }

    /* 오버로딩의 조건
    * 1. 접근 제한자, 반환형은 오버로딩 성립요건에 해당하지 않음.
    * 2. 매개변수 명은 오버로딩과 무관하다.
    * */
    public void test() {}
    public void test(int num) {}
    public void test(int num1, int num2) {}
    public void test(int num1, String str1) {}
    public void test(String str1, int num1) {}
}
