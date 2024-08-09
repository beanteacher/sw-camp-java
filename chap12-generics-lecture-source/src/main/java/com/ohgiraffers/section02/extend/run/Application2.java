package com.ohgiraffers.section02.extend.run;

import com.ohgiraffers.section02.extend.MethodFarm;

public class Application2 {
    public static void main(String[] args) {
        MethodFarm m = new MethodFarm();

        /* 별도의 제약 없음 */
        m.animalType(new Bunny(), new Snake());

        /* extends Mammal */
        m.mammalType(new Bunny());
        // m.mammalType(new Snake());

        /* extends Reptile*/
        // m.reptileType(new Bunny());
        m.reptileType(new Snake());
    }
}
