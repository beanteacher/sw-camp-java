package com.ohgiraffers.section01;

public class Application2 {
    public static void main(String[] args) {
        /* 다형성을 적용하여 객체 배열을 만들어 인스턴스를 연속 처리할 수 있다. */
        Animal[] animals = new Animal[5];

        for(int i = 0; i < animals.length; i++) {
            if(i % 2 == 0) animals[i] = new Rabbit();
            else animals[i] = new Tiger();
        }

        for(Animal animal : animals) {
            animal.eat();   // 동적 바인딩

            /* 각 인스턴스별 고유 메소드 동작을 위해 다운 캐스팅이 명시적으로 필요하다.
            * ClassCastException 방지를 위해 instanceof 연산자 활용 */
            if(animal instanceof Tiger) {
                ((Tiger) animal).bite();
            } else if (animal instanceof Rabbit) {
                ((Rabbit) animal).jump();
            }
        }
    }
}
