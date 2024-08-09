package com.ohgiraffers.section08;

public class kindsOfVariable {

    private int globalNum;          // 전역변수, 인스턴스 변수 : 메소드 실행 시 선언
    private static int staticNum;   // 전역변수, 클래스 변수 : 프로그램 실행 시 선언
    /* 다양한 변수를 이해하고 사용할 수 있다.*/
    public void method (int num) { // 매개변수 일종의 지역변수
        System.out.println("num : " + num);

        /* 매개변수는 호출 시 값이 전달되어 초기화되지만 지역변수는 선언 외에 사용을 위해
        * 반드시 초기화 해야 한다.*/
        System.out.println("localName :");
    }
}
