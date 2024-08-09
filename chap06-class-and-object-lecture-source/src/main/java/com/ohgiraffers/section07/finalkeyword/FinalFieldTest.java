package com.ohgiraffers.section07.finalkeyword;

public class FinalFieldTest {
    /* final 키워드를 사용할 수 있는 위치는 다양하다.
    * 1. 지역변수 : 초기화 이후 값 변경 불가
    * 2. 매개변수 : 호출 시 전달 값 변경 불가
    * 3. 인스턴스 변수(non static) : 인스턴스 생성 후 초기화 이후 값 변경 불가
    * 4. 클래스 변수(static) : 프로그램 시작 후 초기화 이후 값 변경 불가
    * 5. non-static 메소드 : 메소드 재작성(over riding) 불가
    * 6. static 메소드 : 메ㅔㅔ소드 재작성 불가(over riding) 불가
    * 7. 클래스 : 상속 불가
    * */

    /* non-static field 에 final 사용
    * 초기 인스턴스 생성 시 기본 값 0이 필드에 들어가게 되는데 초기화 이후 값 변경이 불가하므로
    * 선언과 동시에 명시적인 초기화가 필요하다. */
    // private final double PI;
    private final double PI = 3.14;

    private final String NAME;

    public FinalFieldTest(String name) {
        this.NAME = name;
    }
    private final static int Pi = 4;

    private static final double PI2 = 3.14;

    /* 생성자를 이용한 초기화는 불가능하다.
    * 생성자는 인스턴스 생성 시점에 호출되고, static 은 프로그램이 시작될 때 할당 되므로
    * 초기화 되지 않은 상태로 선언된 것과 동일하다. */

    /* 초기화 블럭(프로그램 시작 시 수행)을 통해 초기화할 수 있다.*/
    private static final String SNAME;
    private static final int INAME;
    static {
        SNAME = "홍길동";
        INAME = 1;
    }

    public static void main(String[] args) {
            int i = 1;
            int j = i++; // i = 2, j = 1;
            System.out.println(i+ "," + j);
            if((i>++j) && (i++ == j)){
                i += j;
            }
            System.out.println(i);
    }
}
