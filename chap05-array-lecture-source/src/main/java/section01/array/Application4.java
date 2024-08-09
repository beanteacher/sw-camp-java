package section01.array;

import java.util.Scanner;

public class Application4 {
    public static void main(String[] args) {
        /* 5명의 자바 점수를 입력 받아 합계와 평균을 실수로 구하는 프로그램
        * */
        int[] score = new int[5];
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        double avg = 0;

        for(int i = 0; i < score.length; i++) {
            System.out.print((i+1) + "번 째 학생의 점수 입력 : ");
            score[i] = sc.nextInt();
            sum += score[i];
        }

        avg = (double) sum / score.length;
        System.out.println("sum = " + sum);
        System.out.println("avg = " + avg);
    }
}
