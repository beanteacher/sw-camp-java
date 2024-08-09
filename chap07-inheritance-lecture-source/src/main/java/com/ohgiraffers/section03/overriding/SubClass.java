package com.ohgiraffers.section03.overriding;

public class SubClass extends SuperClass {

    /* 메소드명, 리턴타입, 매개변수의 갯수&타입&순서 일치해야 성립*/
    @Override
    public void method(int num) {}
    /* private 오러라이딩 불가 */
    // @Override
    // private void privateMethod() {}

    /* final 오버라이딩 불가 */
    // @Override
    // public final void finalMethod() {}

    /* protected -> public 로 변경 시 더 넓은 범위로 변경이라 가능 */
    @Override
    public void protectedMethod() {}
}
