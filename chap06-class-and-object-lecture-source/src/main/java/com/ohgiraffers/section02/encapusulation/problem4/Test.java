package com.ohgiraffers.section02.encapusulation.problem4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int quotient = (num - 2) / 6;
        int room = 0;
        List<Integer> arrList = new ArrayList<>();

        // 6*0, 6*1, 6*3, 6*6, 6*10
        // 0, 1, 3, 6, 10, 15, 21
        // 1, 2, 3, 4,  5,  6,  7 증가 값
        int addNum = 0;
        arrList.add(addNum);
        if(num == 1) {
            room = 1;
        } else {
            while(quotient >= arrList.get(addNum)) {
                arrList.add(arrList.get(addNum)+(++addNum));
            }

            for(int i = 0; i < arrList.size(); i++) {
                if(quotient >= arrList.get(i) && quotient < arrList.get(i+1)) {
                    room = i+2;
                }
            }
        }
        System.out.println(room);
    }
}

