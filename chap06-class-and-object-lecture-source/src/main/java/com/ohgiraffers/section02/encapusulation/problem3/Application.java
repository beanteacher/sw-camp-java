package com.ohgiraffers.section02.encapusulation.problem3;

public class Application {
    public static void main(String[] args) {
        /* 필드에 직접 접근하는 경우 발생할 수 있는 문제점을 이해한다. */
        Monster monster = new Monster();

        /* Monster 클래스 내부에는 유지보수하면서 코드 변경이 일어나지만
        * 사용자의 호출 코등서는 변경이 필요없다. 따라서 유지보수성이 향상된다.
        * */
        monster.setHp(-200);
        monster.setName("프랑켄슈타인");

        System.out.println(monster.getHp());
        System.out.println(monster.getName());

        int hp = monster.hp;
        String nmae = monster.kinds;
        /* 메소드를 통해 간접 접근하는 방법을 만들었지만 여전히 직접접근이 가능하므로
        * 직접 접근 불가 강제화 처리가 필요하다. */
    }
}
