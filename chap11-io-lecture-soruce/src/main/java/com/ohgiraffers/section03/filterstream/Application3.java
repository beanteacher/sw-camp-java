package com.ohgiraffers.section03.filterstream;

import java.io.*;
import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {
        /* DataInputStream/OutputStream : 데이터 입출력 보조 스트림 */
        Scanner scanner = new Scanner(System.in);
        System.out.print("파일 이름을 입력해주세요. ");
        String fileName = scanner.nextLine();

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))){
            dos.writeUTF("홍길동");
            dos.writeChar('A');
            dos.writeInt(95);

            dos.writeUTF("유관순");
            dos.writeChar('B');
            dos.writeInt(80);

            dos.writeUTF("고길동");
            dos.writeChar('C');
            dos.writeInt(60);
        } catch (IOException e) {
            System.err.println(e);
        }

        try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
            /* 파일에 기록한 순서대로 읽어오지 않는 경우 에러가 발생하거나 의미없는 데이터를 읽어오게 된다.*/
            while (true) {
                System.out.print(dis.readUTF());
                System.out.print(dis.readChar());
                System.out.print(dis.readInt());
            }
            /* read자료형() 메소드는 파일에ㅔ서 더 이상 읽어올 값이 없는 경우 EOFException(End Of File) 발생 */
        } catch (EOFException e) {
            System.out.println("파일 읽기가 완료되었습니다.");
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
