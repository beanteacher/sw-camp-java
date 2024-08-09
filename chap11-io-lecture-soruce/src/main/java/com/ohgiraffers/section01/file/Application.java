package com.ohgiraffers.section01.file;

import java.io.*;
public class Application {
    public static void main(String[] args) {
        /* 대상 파일이 존재하지 않더라도 인스턴스를 생성할 수 있다. */
        File file = new File("C:/Users/Playdata/Downloads/test.txt");

        try {

            if(!file.exists()) {
                boolean createSucc = file.createNewFile();
                System.out.println("createSucc : " + createSucc);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println(file.length());
        System.out.println(file.getPath());
        System.out.println(file.getParent());
        System.out.println(file.getAbsolutePath());

        try {
            boolean deleteSuccess = file.delete();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
