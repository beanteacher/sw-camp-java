package com.ohgiraffers.section09.initblock;

public class Application {
    public static void main(String[] args) {

        Product product = new Product("test", 100, "test1");
        System.out.println(product);

        Product product1 = new Product();
        System.out.println(product1);
    }
}
