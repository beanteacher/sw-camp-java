package com.ohgiraffers.section03.overriding;

/* class 의 final 키워드 : 부정이 불가능한 클래스로 상속 불가
* 상속 : 슈퍼 클래스를 수정하거나 추가해 작업한다.*/
public class SuperClass {
    /* 오버라이딩 성립 조건을 이해할 수 있다. */

    /* 오버라이딩 테스트 기준 메소드 */
    public void method(int num) {}
    private void privateMethod() {}
    public final void finalMethod() {}
    protected void protectedMethod() {}
}
