package com.ohgiraffers.section02.userexcetion;

import com.ohgiraffers.section02.userexcetion.exception.NegativeException;

public class Application1 {
    public static void main(String[] args) {
        ExceptionTest exceptionTest = new ExceptionTest();
        try {
            /* 돈이 부족할 경우 */
            // exceptionTest.checkEnoughMoney(50000,30000);
            /* 정상 */
            exceptionTest.checkEnoughMoney(20000,30000);
            /* 상품 가격이 음수 */
            // exceptionTest.checkEnoughMoney(-50000,30000);
            /* 가진 돈이 음수 */
            // exceptionTest.checkEnoughMoney(50000,-30000);
        } catch (NegativeException e) {
            System.out.println(e);
        } catch (Exception e) {
            /* 예외 상황별로 catch 블럭을 따로 작성해서 처리할 수도 있고,
            * 상위 타입의 Exception 을 이용해서 통합적으로 처리할 수 있다.
            * 단, 상위타입의 Exception 이 먼저 기술되면 아래 코드로 도달할 수 없으므로 컴파일 에러가 발생한다.
            * 서술의 순서는 하위 타입 -> 상위 타입 순으로 기재한다. */
            System.out.println(e);
        } finally {
            System.out.println("백화점에서 나갑니다.");
        }
    }
}
