package com.ohgiraffers.section02.stream;

import java.io.FileWriter;

public class Application4 {
    public static void main(String[] args) {
        try(FileWriter fw = new FileWriter("testWriter.txt")) {
            fw.write("하이");
            fw.write(97);
            fw.write('A');
            fw.write(new char[] {'a', 'b', 'c', 'd'});


        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
