package com.ohgiraffers.section01.list.run;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Application1 {
    /* ArrayList
    * 배열의 단점을 보안, 배열은 크기 변경 불가, 요소의 추가/삭제/정렬 등이 복잡
    * 이러한 기능을 메소드로 구현해서 제공하고 있으며 속도가 빨라지는 것은 아니다. */
    public static void main(String[] args) {
        /* 다형성을 이용해서 상위 레퍼런스로 ArrayList 객체를 참조할 수 있다.
        * List 인터페이스 하위의 다양한 구현체들로 타입이 변경가능하므로 더 유연한 코드를 작성하는 방법이다. */
        ArrayList arrayList = new ArrayList();
        List list = new ArrayList();
        Collection lis1t  = new ArrayList();
        arrayList.add("@");
        /* 저장 순서가 유지된다. */
        System.out.println(arrayList);
        /* 배열의 크기가 아니라 저장 된 요소의 개수를 반환한다.
        * 내부 관리배열의 사이즈는 외부에서 알 필요가 없으므로 기능으로 제공하지 않는다. */
        System.out.println("alist.size() " + arrayList.size());
    }
}
