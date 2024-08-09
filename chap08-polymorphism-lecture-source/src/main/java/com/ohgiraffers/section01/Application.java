package com.ohgiraffers.section01;

public class Application {
    public static void main(String[] args) {
        /* Rabbit 은 Rabbit 이기도 하나 Animal 이기도 하다.
        * Tiger 은 Tiger 이기도 하나 Animal 이기도 하다.
        * */

        /* 부모 타입의 레퍼런스 변수로 자식 인스턴스의 주소 값 참조가 가능하다. */
        Animal rabbit = new Rabbit();
        Animal tiger = new Tiger();

        /* 자식 타입의 레퍼런스 변수로 부모 타입의 인스턴스 주소 값 참조는 불가능하다. */
        // Rabbit animal = new Animal() ;
        // Object 라는 최상위 객체 안에 Animal 이 있는 거 아닌가? 왜 Animal 하위에 Object 가 있는 것처럼 그리지?

        /* 컴파일 당시에는 해당 타입의 메소드와 연결되어 있다가 (정적 바인딩)
        * 런타임 당시 실제 객체가 가진 오버라이딩 된 메소드로 바인딩이 바뀌어 동작 (동적 바인딩) */
        rabbit.cry();
        tiger.cry();

        /* 현재 레퍼런스 변수 타입은 Animal 이기 때문에 Rabbit, Tiger 의 메소드를 호출할 수 있다.
        * 형변환을 통해 호출
        * 형변환보다 참조연산자의 우선 순위가 높아 괄호를 이용해 묶어준다. */
        ((Rabbit) rabbit).jump();
        ((Tiger) tiger).bite();

        /* 타입 형변환을 잘못하는 경우 ClassCastException 발생 */
        // ((Tiger) rabbit).bite();

        /* 레퍼런스 변수가 참조하는 실제 인스턴스가 원하는 타입과 맞는지 비교하는 instanceof 연산자 */
        System.out.println(rabbit instanceof Rabbit);
        System.out.println(rabbit instanceof Tiger);
        System.out.println(tiger instanceof Rabbit);
        System.out.println(tiger instanceof Tiger);
        /* 상속 받은 타입도 가지고 있다. */
        System.out.println(rabbit instanceof Animal);
        System.out.println(tiger instanceof Animal);
        /* 모든 클래스는 Object 의 후손이다. */
        System.out.println(rabbit instanceof Object);
        System.out.println(tiger instanceof Object);

        if(rabbit instanceof Rabbit) ((Rabbit) rabbit).jump();
        if(tiger instanceof Tiger) ((Tiger) rabbit).bite();


        /* up-cast: 상위 타입으로 형변환 (묵시적 형변환)
        * */
        Animal animal1 = (Animal) new Rabbit();
        Animal animal2 = new Rabbit();

        /* down-cast : 하위 타입으로 형변환 (명시적 형변환이 필요)
        * */
        Rabbit rabbit1 = (Rabbit) animal1;
        // Rabbit rabbit2 = animal2;

    }
}
