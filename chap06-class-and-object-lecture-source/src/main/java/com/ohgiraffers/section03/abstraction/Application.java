package com.ohgiraffers.section03.abstraction;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        /* 객제 지향 프로그래밍에 대해 이해하고 객체와 클래스를 설계하여  프로그래밍 할 수 있다. */
        Scanner scanner = new Scanner(System.in);
        CarRacer carRacer = new CarRacer();
        while (true){
            System.out.println("카리이싱 프로그램");
            System.out.println("1. 시동걸기");
            System.out.println("2. 전진");
            System.out.println("3. 정지");
            System.out.println("4. 시동끄기");
            System.out.println("9. 프로그램 종료");
            System.out.println("메뉴");
            int no = scanner.nextInt();

            switch (no) {
                case 1:carRacer.startUp(); break;
                case 2:carRacer.stepAccel(); break;
                case 3:carRacer.stepBreak(); break;
                case 4:carRacer.turnOff(); break;
                case 9:
                    System.out.println("프로그램을 종료합니다.");
            }
        }
    }
}

