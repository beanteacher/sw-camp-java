package com.ohgiraffers.section02.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Application2 {
    public static void main(String[] args) {
        /* FileReader 를 이해하고 사용할 수 있다.
        * FileInputStream 과 사용법은 거의 동일하나 1byte 단위가 아니라 character 단위로 읽어온다. */

        /* try with resource 문으로 작성 */
        try(FileReader fr = new FileReader("C:\\Users\\Playdata\\Desktop\\Lecture\\Java\\chap11-io-lecture-soruce\\testReader.txt")) {
            // int value;
            // while((value = fr.read()) != -1) {
            //     System.out.println((char) value);
            // }
            char[] carr = new char[100];
            fr.read(carr);
            for(char c : carr) System.out.print(c);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
