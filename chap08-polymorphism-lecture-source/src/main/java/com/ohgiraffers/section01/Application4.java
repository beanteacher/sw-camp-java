package com.ohgiraffers.section01;

import java.util.Random;

public class Application4 {
    public static void main(String[] args) {
        /* 다형성을 적용하여 리턴타입에 활용할 수 있다.*/
        Application4 application4 = new Application4();
        application4.getRandomAnimal().run();

    }

    /* 다형성을 적용하지 않으면 각각의 동물을 반환하는 메소드를 별도로 작성해야한다. */
    public Animal getRandomAnimal() {
        Random random = new Random();
        return random.nextInt(2) == 0 ? new Rabbit() : new Tiger();
    }
}

