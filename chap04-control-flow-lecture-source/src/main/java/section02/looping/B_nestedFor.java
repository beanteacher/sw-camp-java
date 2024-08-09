package section02.looping;

import java.util.Scanner;

public class B_nestedFor {

    public void printGugudanFromTwoToNine() {
        for(int i = 2; i < 10; i++) {
            for(int j = 1; j < 10; j++) {
                System.out.println(i + "*" + j + "=" + i*j);
            }
        }
    }

    public void printStar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("출력할 행 수 입력 : ");
        int row = sc.nextInt();

        for(int i = 1; i <= row; i++) {
            for(int j = 1; j <= row; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void printTriangleStar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("출력할 행 수 입력 : ");
        int row = sc.nextInt();

        for(int i = 1; i <= row; i++) {

            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
