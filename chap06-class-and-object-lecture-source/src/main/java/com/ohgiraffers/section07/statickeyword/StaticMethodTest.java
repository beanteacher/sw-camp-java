package com.ohgiraffers.section07.statickeyword;

public class StaticMethodTest {
    private int count;
    private static int staticCount;
    public void nonStaticMethod() { this.count++; }
    /* static 메소드는 인스턴스를 생성하지 않고 사용하는 메소드이기 때문에 this 라는 키워드를 사용할 수 없다. */
    public static void staticMethod() { staticCount++; }
}
