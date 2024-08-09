package com.ohgiraffers.section06.object_array;

public class Application {
    public static void main(String[] args) {
        /* 객체 배열에ㅔ 대해 이해할 수 있다. */
        Car[] cars = new Car[5];
        String[] modelNames = {"페라리", "람보르기니", "롤스로이스", "부가티", "포터"};

        /* cars 의 각 인덱스는 기본 값 null 로 초기화 되어 잇기 때문에 인덱스 별로 인스턴스를 생성해야 한다.*/
        for(int i = 0; i < cars.length; i++) {
            cars[i] = new Car(modelNames[i], 300);
        }

        for (Car car : cars) {
            car.driveMaxSpeed();
        }

        Car[] cars2 = {
            new Car("롤스로이스", 200)
        };

        for (Car car2 : cars2) {
            car2.driveMaxSpeed();
        }
    }
}
