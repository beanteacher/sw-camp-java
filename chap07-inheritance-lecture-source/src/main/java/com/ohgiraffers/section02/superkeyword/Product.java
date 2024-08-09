package com.ohgiraffers.section02.superkeyword;

import lombok.Data;

import java.util.Date;

@Data
public class Product {
    private String code;
    private String brand;
    private String name;
    private int price;
    private Date manufacturingDate;

    public Product() {
        System.out.println("Product 기본 생성자");
    }

    public Product(String code, String brand, String name, int price, Date manufacturingDate) {
        this.code = code;
        this.brand = brand;
        this.name = name;
        this.price = price;
        this.manufacturingDate = manufacturingDate;
        System.out.println("Product 매개변수 생성자");
    }
}
