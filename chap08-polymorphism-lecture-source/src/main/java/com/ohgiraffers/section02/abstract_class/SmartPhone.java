package com.ohgiraffers.section02.abstract_class;

/* 추상 클래스를 상속받을 경우 추상 메소드를 반드시 오버라이딩 해야 한다. (오버라이딩 강제화)
* 혹은 상속받은 클래스 또한 추상클래스로 만들어야한다. (미완성 클래스)
* */
public class SmartPhone extends Product {
    @Override
    public void abstractMethod() {
        System.out.println("Product 클래스의 abstractMethod 오버라이딩 한 메소드 호출");
    }
}
