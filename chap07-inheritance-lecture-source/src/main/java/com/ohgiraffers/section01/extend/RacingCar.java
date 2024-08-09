package com.ohgiraffers.section01.extend;

public class RacingCar extends Car {
    @Override
    public void stop() {
        System.out.println("레이싱카는 경적을 울리지 않습니다.");
        super.stop();
    }

    @Override
    public void run() {
        System.out.println("레이싱카 전속력으로 질주한다.");
    }

    @Override
    public void soundHorn() {
        System.out.println("레이싱카는 경적을 울리지않습니다.");}

    public RacingCar() {
    }
}
