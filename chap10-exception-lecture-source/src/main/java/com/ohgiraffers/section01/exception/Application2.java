package com.ohgiraffers.section01.exception;

public class Application2 {
    public static void main(String[] args) {
        ExceptionTest exceptionTest = new ExceptionTest();
        /* 예외처리가 강제화 된 메소드를 호출하는 경우 반드시 예외처리가 필요하다.
        * 여기서는 throws 로 다시 책임을 위임하는 처리를 했다.
        * 단 main ㅁ소드까지 예외를 throws 하면 프로그램은 비정상 종료된다.*/
        try {
            /* try : 예외 발생 가능ㅅ헝이 있는 코드를 작성 */
            exceptionTest.checkEnoughMoney(10000,2000);
            System.out.println("상품구입 가능");
        } catch (Exception e) {
            /* catch : try 블럭 안에서 예외 발생 시 catch 블럭의 코드가 실행된다. */
            System.out.println(e);
            System.out.println("상품구입 불가");
        }
        /* 예외가 발생하더라도 catch 블럭 실행 후 프로그램의 수행 흐름으로 돌아와 정상 종료된다. */
        System.out.println("프로그램 종료");
    }
}
