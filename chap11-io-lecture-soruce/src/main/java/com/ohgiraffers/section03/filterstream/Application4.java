package com.ohgiraffers.section03.filterstream;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Application4 {
    public static void main(String[] args) {

        /* ObjectInputStream / ObjectOutputStream */
        MemberDTO[] members = {
                new MemberDTO("user01", "pass01", 25, '남', 95.7),
                new MemberDTO("user02", "pass02", 26, '남', 95.8),
                new MemberDTO("user03", "pass03", 27, '여', 40.7)
        };

        Scanner scanner = new Scanner(System.in);
        String filename = scanner.nextLine();
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            for(MemberDTO member : members) {
                oos.writeObject(member);
            }
        } catch (IOException e) {
            System.err.println(e);
        }

        MemberDTO[] inputMembers = new MemberDTO[members.length];

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            for(int i = 0; i < inputMembers.length; i++) {
                inputMembers[i] = (MemberDTO) ois.readObject();
            }
            for (MemberDTO member : inputMembers) {
                System.out.println(member);
            }
        } catch (IOException e) {
            System.err.println(e);
        } catch (ClassNotFoundException e) {
            /* 역 직렬화 시 해당 클래스가 없으면 실패하므로 Exception handling 필수 */
            System.err.println(e);
        }
    }
}
