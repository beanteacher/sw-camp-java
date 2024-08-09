package com.ohgiraffers.section02.stream;

import java.io.FileOutputStream;

public class Application3 {
    public static void main(String[] args) {
        /* 경로에ㅔ 문제 없이 파일이 존재하지 않을 경우 자동으로 파일이 생성 되지만
        * 존재하지 않는 경로가 포함되면 FileNotFoundException 이 발생한다.
        * 두 번째 인자로 true 를 추가하면 존재하는 파일의 매 끝에서부터 추가된다.*/
        try(FileOutputStream fos = new FileOutputStream("testOutputStream.txt", true)) {
            fos.write(97);

            byte[] bytes = new byte[] {98,99,100,101,102,103,10};

            fos.write(bytes);

            fos.write(bytes, 1, 3);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
