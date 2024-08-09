package com.ohgiraffers.section03.uses;

import java.io.BufferedReader;
import java.io.FileReader;

public class Application1 {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("test.txt"));
            /* FileReader 생성자에 throws FileNotFoundException 이 있으므로
            * 호출해서 사용하는 쪽에서 예외처리를 해줘야한다.*/
            StringBuilder sb = new StringBuilder();
            while(br.readLine() != null) {
                System.out.println(br.readLine());
                sb.append(br.readLine());
            }

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            /* 일반적으로 I/O에서 사용한 자원을 반납할 목적으로 사용 */
            try {
                /* close() 메소드는 입출력에서 사용한 스트림을 닫아주는 메소드로 finally 블럭 안에서도 try_catch 문이 필요하다. */
                br.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
