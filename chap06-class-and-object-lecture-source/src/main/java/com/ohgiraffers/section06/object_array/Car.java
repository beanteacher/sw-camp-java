package com.ohgiraffers.section06.object_array;

public class Car {
    private String modelName;
    private int maxSpeed;
    public Car(String modelName, int maxSpeed) {
        this.modelName = modelName;
        this.maxSpeed = maxSpeed;
    }

    public void driveMaxSpeed() {
        System.out.println(modelName + " 차량의 최고 속도는 " + maxSpeed + "km/h 입니다.");
    }
}
