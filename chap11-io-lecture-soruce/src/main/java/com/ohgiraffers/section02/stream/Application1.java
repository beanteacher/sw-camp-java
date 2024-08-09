package com.ohgiraffers.section02.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class Application1 {
    public static void main(String[] args) throws IOException {
        /* FileInputStream  을 사용할 수 있다. */
        FileInputStream fis = null;
        try {
            /* 읽어올 대상 파일이 존재하지 않는 경우에 대해서 FileNotFoundException 처리가 필요함 */
            fis = new FileInputStream("C:/Users/Playdata/Desktop/Lecture/Java/chap11-io-lecture-soruce/testInputStream.txt");
            int value;

            /* read() : 파일에 기록 된 값을 순차적으로 읽어오고 더 이상 읽어올 데ㅔ이터가 없으면 -1 반환 */
            // while((value = fis.read()) != -1) {
            //     System.out.println((char) value);
            // }

            byte[] bar = new byte[100];
            fis.read(bar);
            System.out.println(Arrays.toString(bar));
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            if(fis != null) {
                fis.close();
            }
        }
    }
}
