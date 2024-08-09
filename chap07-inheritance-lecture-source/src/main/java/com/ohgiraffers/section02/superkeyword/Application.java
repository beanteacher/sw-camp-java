package com.ohgiraffers.section02.superkeyword;

import java.util.Date;

public class Application {
    public static void main(String[] args) {
        Computer computer = new Computer();
        System.out.println("computer : " + computer);
        System.out.println();
        Computer computer1 = new Computer("5", 256, 16, "Windows");
        System.out.println("computer1 : " + computer1);
        System.out.println();
        Computer computer2 = new Computer("A-112", "Samsung", "notebook", 3000000, new Date(),"5", 256, 16, "Windows");
        System.out.println("computer2 : " + computer2);
        System.out.println();

        Product product = new Product();
        System.out.println("product : " + product);
        System.out.println();
        Product product1 = new Product("A-112", "Samsung", "notebook", 3000000, new Date());
        System.out.println("product1 : " + product1);
        System.out.println();
    }
}
