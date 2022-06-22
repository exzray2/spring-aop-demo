package com.exzray.model;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {

    public String checkout(String status) {
        System.out.println("Checkout action trigger!");
        return "dasdas";
    }

    public int quantity() {
        return 10;
    }

}
