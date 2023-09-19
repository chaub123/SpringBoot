package com.example.demo.demoshopping.model;

import java.util.ArrayList;
import java.util.List;

public class CartDatabase {
    public static List<Cart> carts = new ArrayList<>(); 

    public static void clear(int customerId){
    }

    public static void add(Cart cart){
        carts.add(cart);
    }
}
