package com.example.demo.demoshopping.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)

public class Item extends Good{
    private int quantity;

    public Item(double price, String description, int quantity){
        super(price, description);
        this.quantity = quantity;
    }
}
