package section01.conditional;

import java.util.Scanner;

public class A_if {

    public void testSimpleIfStatement() {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력 : ");
        int num = sc.nextInt();
        if(num % 2 == 0) {
            System.out.println("입력하신 숫자는 짝수입니다.");
        }

        System.out.println("입력하신 숫자는 홀수입니다.");
    }

    public void testNestedIfStatement() {
        /* 중첩된 if 문의 흐름을 이해하고 적용할 수 있다. */
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력 : ");
        int num = sc.nextInt();

        if(num > 0) {
            if(num % 2 == 0) {
                System.out.println("입력하신 숫자는 짝수입니다.");
            }
        }
        System.out.println("프로그램을 종료합니다.");
    }
}
