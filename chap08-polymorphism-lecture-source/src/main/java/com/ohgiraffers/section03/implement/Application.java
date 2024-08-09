package com.ohgiraffers.section03.implement;

import com.ohgiraffers.section03.implement.IF.ProductIF;

public class Application {
    public static void main(String[] args) {
        ProductIF product = new Product();

        product.abstractMethod();
        product.defaultMethod();
        product.nonStaticMethod();

        System.out.println(ProductIF.MAX_NUM);
    }
}
