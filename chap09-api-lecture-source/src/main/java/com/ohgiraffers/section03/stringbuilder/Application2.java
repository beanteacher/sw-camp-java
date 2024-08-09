package com.ohgiraffers.section03.stringbuilder;

public class Application2 {
    public static void main(String[] args) {
        /* StringBuilder 의 자주사용하는 메소드 */
        StringBuilder sb1 = new StringBuilder();
        /* 용량(현재의 버퍼 크기)를 정수형으로 변환하여 문자열 길이 + 16이 기본 값 */
        System.out.println(sb1.capacity());
        for(int i = 0; i < 50; i++) {
            /* 인자로 전달된 값을 문자열로 변환 후 기존 문자열의 마지막에 추가한다. */
            sb1.append(i);
            System.out.println("sb1 : " + sb1);
            System.out.println("sb1.capacity() : " + sb1.capacity()); // n = 2(n-1) + 2
            System.out.println("sb1.hashCode() : " + sb1.hashCode());
        }

        StringBuilder sb2 = new StringBuilder("javaOracle");
        System.out.println("sb2 " + sb2);

        System.out.println("delete : " + sb2.delete(2, 5));
        System.out.println("deleteCharAt : " + sb2.deleteCharAt(0));
        System.out.println("sb2 : " + sb2);

        System.out.println("insert() : " + sb2.insert(1, "vaO"));
        System.out.println("insert() : " + sb2.insert(0, "j"));
        System.out.println("insert() : " + sb2.insert(sb2.length(), "Jdbc"));
        System.out.println("insert() : " + sb2.reverse());

        /* String 클래스와 동일한 메소드 : charAt(), indexOf(), lastIndexOf(), length(), replace(), substring(), toString()
        * 등의 메소드가 있다. */
    }
}
