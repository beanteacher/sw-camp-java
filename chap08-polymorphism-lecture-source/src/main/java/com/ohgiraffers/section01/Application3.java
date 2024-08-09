package com.ohgiraffers.section01;

public class Application3 {
    public static void main(String[] args) {
        /* 다형성을 적용하여 매개변수에 활용할 수 있다. */
        Rabbit rabbit = new Rabbit();
        Tiger tiger = new Tiger();

        Application3 application3 = new Application3();
        application3.feed(rabbit);
        application3.feed(tiger);
        application3.feed(new Animal());
    }

    /* 다형성을 적용하지 않으면 각 동물별로 먹이를 주는 메소드가 작성되어야하며
    * 동물의 종류가 늘어나면 추가 메소드 정의가 필요하다
    * 지금은 Animal 이라는 상위 타입으로 정의했기 때문에 동물이 추가되어도 동일 메소드를 활용할 수 있다. */
    public void feed(Animal animal) {
        animal.eat();
    }
}
