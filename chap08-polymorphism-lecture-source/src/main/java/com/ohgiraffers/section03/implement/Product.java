package com.ohgiraffers.section03.implement;

import com.ohgiraffers.section03.implement.IF.ProductIF;

public class Product implements ProductIF {

    /* ProductIF의 추상 메소드는 반드시 구현해야한다. */
    @Override
    public void nonStaticMethod() {
        System.out.println("ProductIF의 nonStaticMethod 오버라이딩한 메소드 호출");
    }

    @Override
    public void abstractMethod() {
        System.out.println("ProductIF의 abstractMethod 오버라이딩한 메소드 호출");
    }

    /* static 메소드는 오버라이딩 할 수 없다.
    * default 메소드는 오버라이딩이 강제화되지 않는다. 선택적으로 오버라이딩 한다.
    * 일반적으로 {}를 작성하고
    * */

    @Override
    public void defaultMethod() {
        ProductIF.super.defaultMethod();
    }
}
