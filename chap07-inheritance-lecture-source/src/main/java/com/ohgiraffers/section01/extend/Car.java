package com.ohgiraffers.section01.extend;

public class Car {
    private boolean runningStatus;
    public Car() {
        /* 모든 클래스는 Object 클래스의 후손이다. */
        super();
        System.out.println("Car 기본 생성자 호출");
    }

    public void run() {
        runningStatus = true;
        System.out.println("자동차가 달립니다.");
    }

    public void stop() {
        runningStatus = false;
        System.out.println("자동차가 멈춥니다.");
    }

    public void soundHorn() {
        if(isRunning()) {
            System.out.println("빵빵아");
        } else {
            System.out.println("옥지얌");
        }
    }

    protected boolean isRunning() { return runningStatus; }
}
