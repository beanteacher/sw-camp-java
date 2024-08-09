package com.ohgiraffers.section04.override;

import java.io.FileNotFoundException;

public class SubClass extends SuperClass {

    /* throws 구문 없이 오버라이딩 가능 */
    // @Override
    // public void method() {}

    /* 부모 예외처리 클래스보다 상위의 예외로는 후손 클래스에서 오버라이딩 불가능 */
    // @Override
    // public void method() throws Exception {}

    @Override
    public void method() throws FileNotFoundException {}
}
