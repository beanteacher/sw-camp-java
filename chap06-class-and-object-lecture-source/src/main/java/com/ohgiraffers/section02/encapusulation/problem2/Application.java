package com.ohgiraffers.section02.encapusulation.problem2;

public class Application {
    public static void main(String[] args) {
        /* 필드에 직접 접근하는 경우 발생할 수 있는 문제점을 이해한다. */
        Monster monster = new Monster();

        /* 필드의 변경이 발생하면 사용한 족의 코드를 모두 수정해야 한다.
        * 이는 유지보수에 악영향을 끼친다.
        * */
        monster.setHp(-200);
        monster.setName("프랑켄슈타인");

        System.out.println(monster.getHp());
        System.out.println(monster.getName());
    }
}
