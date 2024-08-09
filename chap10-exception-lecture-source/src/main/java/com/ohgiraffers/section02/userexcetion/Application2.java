package com.ohgiraffers.section02.userexcetion;

import com.ohgiraffers.section02.userexcetion.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userexcetion.exception.NotEnoughMoneyException;
import com.ohgiraffers.section02.userexcetion.exception.PriceNegativeException;

public class Application2 {
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
        } catch (MoneyNegativeException | PriceNegativeException e) {
            /* | 동일한 레벨의 다른 타입의 예외를 하나의 catch 블럭에서 처리할 수 있다.
            * 단, 상위 타입의 Exception 과 하위 타입의 Exception 이 함께 서술 될 수 없다.
            * EX : Exception | NotEnoughException (X)
            * */
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
