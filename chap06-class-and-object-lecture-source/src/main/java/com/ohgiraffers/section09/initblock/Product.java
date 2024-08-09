package com.ohgiraffers.section09.initblock;

import javax.swing.plaf.SplitPaneUI;

public class Product {
    /* 초기화 블럭의 동작 순서를 이해하고 이를 활용하여 */
    // private String name;
    // private int price;
    // private static String board;

    private String name = "갤럭시";
    private int price =  10001000;
    private static String board = "삼송";

    /* 초기화 블럭*/
    /* 인스턴스 블럭 */
    {
        name = "사이언";
        price = 800000;
        board = "맛이";

        System.out.println("instance 초기화 블럭");
    }

    static {
        board = "삼립";
        // name = "아이뽕";
        // price = 1000000;
        System.out.println("static 초기화 동작");
    }

    public Product(){

    }

    public Product(String name, int price, String board) {
        this.name = name;
        this.price = price;
        Product.board = board;
        System.out.println("매개변수 호출");
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                "board='" + board + '\'' +
                ", price=" + price +
                '}';
    }
}
