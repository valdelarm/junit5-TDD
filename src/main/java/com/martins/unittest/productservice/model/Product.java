package com.martins.unittest.productservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private Integer id;
    private String name;
    private Integer quantity;
    private Integer version;

    public Product(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public Product(Integer id, String name, Integer quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }
}
