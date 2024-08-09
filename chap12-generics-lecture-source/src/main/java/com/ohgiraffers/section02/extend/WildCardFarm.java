package com.ohgiraffers.section02.extend;

import com.ohgiraffers.section02.extend.run.Bunny;
import com.ohgiraffers.section02.extend.run.Rabbit;
import com.ohgiraffers.section02.extend.run.RabbitFarm;

public class WildCardFarm {
    public void anyType(RabbitFarm<?> farm) {
        farm.getRabbit().cry();
    }

    public void extendTyppe(RabbitFarm<? extends Bunny> farm) {
        farm.getRabbit().cry();
    }

    public void superType(RabbitFarm<? super Bunny> farm) {
        farm.getRabbit().cry();
    }
}
