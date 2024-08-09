package com.ohgiraffers.section03.filterstream;

import java.io.Serializable;

/* 객체 입출력 처리를 위해서는 반드시 직렬화를 구현해야한다.
* 직렬화 대상 클래스에 Serializable 인퍼페이스만 구현하면 직렬화가 필요한 상황인 경우 데이터가 직렬화 처리 된다.*/
public class MemberDTO implements Serializable {
    private String id;
    private String pwd;
    private int age;
    private char gender;
    /* transient : 해당 필드는 직렬화 처리에서 제외하겠다는 의미 */
    private transient double point;

    public MemberDTO(String id, String pwd, int age, char gender, double point) {
        this.id = id;
        this.pwd = pwd;
        this.age = age;
        this.gender = gender;
        this.point = point;
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", point=" + point +
                '}';
    }
}
