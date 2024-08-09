package com.ohgiraffers.section02.encapusulation.problem1;

public class Application {
    public static void main(String[] args) {
        /* 필드에 직접 접근하는 경우 발생할 수 있는 문제점을 이해한다. */
        Monster monster1 = new Monster();
        monster1.name = "두치";
        monster1.hp = 200;
        System.out.println("monster1 name : " + monster1.name);
        System.out.println("monster1 hp : " + monster1.hp);

        Monster monster2 = new Monster();
        monster2.name = "뿌꾸";
        monster2.hp = -200;
        System.out.println("monster2 name : " + monster2.name);
        System.out.println("monster2 hp : " + monster2.hp);
    }
}
