package com.ohgiraffers.section01.extend;

public class FireCar extends Car {
    /* Car 클래스의 모든 멤버(필드, 메소드)를 상속 받을 수 있다.
    * 단, 생성자는 상속받지 못하며 부모의 private 멤버는 접근이 불가하다.
    * */

    public FireCar() {
        /* 모든 생성자에는 맨 첫줄에 super()를 컴파일러가 자동으로 추가한다.
        * 부모의 기본 생성자를 호출하는 구문으로 명시적 or 묵시적으로 사용가능하다. */
        super();
        System.out.println("Fire Car 기본 생성자 호출");
    }

    /* 메소드 재작성 (overriding)
    * @Override 어노테이션 : 오버라이딩 성립 요건을 체크하여 성리되지 않는 경우 컴파일 에러를 발생시킨디.*/
    @Override
    public void soundHorn() {
        if(isRunning()) System.out.println("빵빵빵빵빵빵빵빵빵");
        else {
            System.out.println("옥옥옥옥옥옥옥옥옥지얌");
        }
    }

    /* 상속은 자식 클래스가 부모 클래스를 확장하는 것아므로 FireCar 만의 추가 기능도 작성할 수 있다.*/
    public void sprayWater() {
        System.out.println("뿌뿌 물뿌리기");
    }
}
