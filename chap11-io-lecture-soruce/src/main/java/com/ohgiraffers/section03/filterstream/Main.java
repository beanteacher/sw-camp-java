package com.ohgiraffers.section03.filterstream;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(solution(scanner.nextLine()));
    }

    public static String solution(String s) {
        String answer = "";
        String[] strArr = s.split(" ");

        for(int i = 0; i < strArr.length; i++) {
            for(int j = 0; j < strArr[i].length(); j++) {
                if(j % 2 == 0) {
                    answer += Character.valueOf(strArr[i].charAt(j)).
                            toString().toUpperCase();
                } else {
                    answer +=  Character.valueOf(strArr[i].charAt(j)).
                            toString().toLowerCase();
                }
            }
            answer+=" ";
        }
        if(answer.length() != s.length()) {
            answer = answer.substring(0, s.length()-1);
        }

        return answer;
    }
}
