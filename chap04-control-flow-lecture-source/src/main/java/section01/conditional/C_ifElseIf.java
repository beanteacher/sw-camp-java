package section01.conditional;

import java.util.Random;
import java.util.Scanner;

public class C_ifElseIf {
    public void testSimpleIfElse() {
        /* if-else 의 흐름을 이해하고 적용할 수 있다. */
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int score = sc.nextInt();
        String grade = "";

         if (score >= 90) {
             grade = "A";
        } else if (score >= 80) {
             grade = "B";
         } else if  (score >= 70) {
             grade = "C";
         } else if (score >= 60) {
             grade = "D";
         } else {
             grade = "F";
         }
        System.out.print("학생 점수 : " + score +  "등급은 : " + grade);
        System.out.println("프로그램을 종료합니다.");
    }

    public void testForExample2() {
        Random rand = new Random();
        int randInt = rand.nextInt(5, 11);
        System.out.println(randInt);
        int sum = 0;
        for(int i = 1; i < randInt; i++) {
            sum += i;
        }

        System.out.println("1부터 " + randInt + "까지의 합계" + sum);
    }

    public void testForExample3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번 째 정수 : ");
        int firstNum = sc.nextInt();
        System.out.print("두번 째 정수 : ");
        int secondNum = sc.nextInt();
        int sum = 0;
        if(firstNum > secondNum) {
            for (int i = secondNum; i <= firstNum; i++) {
                sum += i;
            }
        } else {
            for (int i = firstNum; i <= secondNum; i++) {
                sum += i;
            }
        }

        System.out.println("합계 : " + sum);
    }

    public void testForExample4() {
        Scanner sc = new Scanner(System.in);
        System.out.print("출력할 구구단의 수 : ");
        int dan = sc.nextInt();
        if(dan > 1 && dan <10) {
            for(int su = 1; su < 10; su++) {
                System.out.println(dan + " * " + su + "=" + dan*su);
            }
        } else {
            System.out.println("반드시 2-9 사이의 정수를 입력하셔야 합니다.");
        }
    }
}
