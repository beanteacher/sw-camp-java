package com.ohgiraffers.section02.encapusulation.problem3;

public class Monster {
    /* Monster 클래스에 변경사항이 발생 */
    // private String name;
    String kinds;
    int hp;

    public void setHp(int hp) {
        if(hp > 0) {
            System.out.println("양수 값이 입력되어 몬스터의 ㅊ력을 입력한 값으로 변경한다.");
            /* this : 인스턴스 변수가 생성되었을 때 자신의 주소를 저장하는 레퍼런스 변수이다. */
            this.hp = hp;
        } else {
            System.out.println("0보다 작거나 작은 값이 입력되어 몬스터의 체력을 0으로 변경한다.");
            hp = 0;
        }
    }

    public int getHp() {
        return this.hp;
    }

    public void setName(String kinds) {
        this.kinds = kinds;
    }

    public String getName() {
        return this.kinds;
    }
}
