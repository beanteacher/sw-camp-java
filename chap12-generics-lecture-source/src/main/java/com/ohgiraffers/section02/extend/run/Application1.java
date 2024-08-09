package com.ohgiraffers.section02.extend.run;

public class Application1 {
    public static void main(String[] args) {
        /* extends 키워들 이용하여 특정 타입만 사용하도록 제닉 버무이를 흡수한다. */
        RabbitFarm<Rabbit> farm1 = new RabbitFarm<>();
        RabbitFarm<Bunny> farm2 = new RabbitFarm<>();
        RabbitFarm<DrunkenBunny> farm3 = new RabbitFarm<>();
    }
}
