package com.ohgiraffers.section02.encapusulation.problem4;

public class Monster {
    /* 접근 제한자
    * 클래스 혹은 클래스의 멤벙 참조 연산자로 접근할 수 있는 범위를 제한하기 위한 키워드
    * 1. public : 접근 제한 X
    * 2. protected : 동일 패키지 내 접근 가능(단, 산속관계 시 다른 패키지도 접근 가능)
    * 3. default : 동일 패캐지 내 접근 허용(작성하지 않는 것이 default)
    * 4. private
    * 위의 4가지 접근 제한자는 클래스의 멤버(필드, 메소드)에 모두 사용가능하다.
    * 단, 클래스 선언 시 사용하는 접근 제한자는 public, default 뿐이다. */
    private String kinds;
    private int hp;

    public String getKinds() {
        return kinds;
    }

    public void setKinds(String kinds) {
        this.kinds = kinds;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
         if(hp > 0 ) {
            this.hp = hp;
         } else{
             this.hp = 0;
         }
    }
}
