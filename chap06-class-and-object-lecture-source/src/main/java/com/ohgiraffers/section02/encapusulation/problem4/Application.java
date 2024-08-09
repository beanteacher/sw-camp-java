package com.ohgiraffers.section02.encapusulation.problem4;

public class Application {
    public static void main(String[] args) {

        /* 접근 제한자에 대해 이해하고 직접 필드에 접근 못하게 강제할 수 있다.  */
        Monster monster = new Monster();
        /* 필드에 private 를 이용해 접근을 제한하였으므로 직접 접근 코드는 compile error 발생 */
        monster.setHp(15);
        monster.setKinds("두치");
    }
}
