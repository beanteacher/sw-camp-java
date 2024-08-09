package com.ohgiraffers.section03.implement.IF;

/* 인터페이스는 인터페이스에 상속할 수 있다.  이 땐 extends 키워드를 사용한다
* 클래스 Iimple Inesrt 인터페이스, 인터페이스2 - > 다중 상속\
*
* 9* 인터페이스 extends 인터페이스), 인터페이스)*/
public interface ProductIF {
    /* 인터페이스는 상수 필드만 작성 가능하다.
     * 상수 필드만 가질 수 있기 때문에 모든 필드는 묵시적으로 public static final(생략 가능) 이다.
     * */
    public static final int MAX_NUM = 100;

    /* 인터페이스 내부에는 생성자 선언 불가능 */
    // public ProductIF() {}

    /* 인터페이스 구현부가 있는 non-static 메소드를 가질 수 없다. */
    // public void nonStaticMethod() {}

    /* 추상 메소드만 작성 가능하다. (생략 가능-> 초기엔 명확하게 알기위해 명시해보도록 하자) */
    public abstract void nonStaticMethod();

    public abstract void abstractMethod();

    /* static 메소드는 작성 가능하다. (JDK 1.8 추가) */
    public static void staticMethod() {
        System.out.println("ProductIF의 staticMethod 호출");
    }

    /* default 키워드를 사용하면 non-static 메소드도 작성 가능하다. (JDK 1.8 추가)
     * default 메소드는 완성되어 있으므로 오버라이딩이 강제화되지 않는다.
     * (일반적으로 {}만 작성하고 내용을 비워놓는다.) */
    public default void defaultMethod() {
        System.out.println("ProductIF의 defaultMethod 호출");
    }

    // default default void defalt();

}
