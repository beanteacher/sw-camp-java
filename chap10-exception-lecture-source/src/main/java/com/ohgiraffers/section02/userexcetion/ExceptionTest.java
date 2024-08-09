package com.ohgiraffers.section02.userexcetion;

import com.ohgiraffers.section02.userexcetion.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userexcetion.exception.NegativeException;
import com.ohgiraffers.section02.userexcetion.exception.PriceNegativeException;

public class ExceptionTest {
    public void checkEnoughMoney(int price, int money) throws NegativeException {

        if (price < 0) {
            throw new PriceNegativeException("상품 가격은 음수일 수 없습니다.");
        }
        if (money < 0) {
            throw new MoneyNegativeException("가지고 있는 돈은 음수 일 수 없습니다..");
        }
        if (money < price) {
            throw new NegativeException("돈이 부족합니다.");
        }

        System.out.println("즐거운 쇼핑하세요.");
    }
}
