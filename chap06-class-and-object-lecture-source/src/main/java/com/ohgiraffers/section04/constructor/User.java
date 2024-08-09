package com.ohgiraffers.section04.constructor;

import java.util.Date;

public class User {
    /* 필드 선언부 */
    private String id;
    private String pwd;
    private String name;
    private Date enrollDate;

    /* 생성자 선언부 */
    /* 1. 기본 생성자
    * 클래스 내부에 작성 된 생성자가 없을 경우 컴파일러가 자동으로 기본 생성자를 생성한다. */
    public User() {
        System.out.println("User 기본생성자");
    }

    /* 2. 매개변수 생성자 */
    /* 초기화 할 필드가 여러가지인 경우 필드 조합별로 생성자를 여러 개 작성할 수 있다. **/
    public User(String id, String pwd) {
        this.id = id;
        this.pwd = pwd;
        System.out.println("User id, pwd 초기화하는 매개변수 생성자");
    }

    public User(String id, String pwd, String name, Date enrollDate) {
        // this.id = id;
        // this.pwd = pwd;
        /* this() : 동일 클래스 내의 다른 생성자 메소드를 호출하는 구문
        * 리턴되어 돌아오지만 리턴 값은 존재하지 않으며 가장 첫줄에 선언해야 한다.*/
        this(id, pwd);
        this.name = name;
        this.enrollDate = enrollDate;
        System.out.println("User id, pwd, name, enrollDate 초기화하는 매개변수 생성자");
    }

    /* 메소드 선언부 */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getEnrollDate() {
        return enrollDate;
    }

    public void setEnrollDate(Date enrollDate) {
        this.enrollDate = enrollDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", name='" + name + '\'' +
                ", enrollDate=" + enrollDate +
                '}';
    }
}
