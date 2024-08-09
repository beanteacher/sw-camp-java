package com.ohgiraffers.section02.superkeyword;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Computer extends Product{
    private String cpu;
    private int hdd;
    private int ram;
    private String operationSystem;

    public Computer() {
        System.out.println("Computer 기본 생성자");
    }

    public Computer(String cpu, int hdd, int ram, String operationSystem) {
        super();
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;
        System.out.println("Computer 클래스의 모든 필드 초기화하는 생성자 호출");
    }

    public Computer(String code, String brand, String name, int price, Date manufacturingDate, String cpu, int hdd, int ram, String operationSystem) {
        super(code, brand, name, price, manufacturingDate);
        /* 위에 작성 된 생성자를 this()로 호출한다는 것은 super()를 두 번 호출하는 것과 같기 때문에 허용되지 않는다.
        * super 또한 맨 첫 줄에 있어야한다.
        * */
        // this(cpu, hdd, ram, operationSystem);
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;
        System.out.println("Product 와 Computer 클래스의 모든 필드 초기화하는 생성자 호출");
    }

    @Override
    public String toString() {
        /*
        * return super.toString() + this.toString()
        * 재귀호출(함수 내부에서 함수가 자기 자신을 또다시 호출하는 행위)이 일어나서 StackOverflowError 발생 */
        return super.toString() + ", { Computer(" +
                "cpu=" + cpu +
                ", hdd=" + hdd +
                ", ram=" + ram +
                ", operationSystem=" + operationSystem + ")}";
    }
    /* 부모 필드에 직접 접근은 불가하지만 getter, setter 메소드는 자신의 것처럼 사용가능하므로
    * 자식 클래스에서 추가된 필드에 대해서만 getter, setter 를 작성한다. */
}
