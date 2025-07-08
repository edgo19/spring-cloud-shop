package com.example.product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {
    private final List<Product> products = new ArrayList<>();

    public ProductRepository() {
        products.add(new Product(1L, "Apple", 0.99));
        products.add(new Product(2L, "Banana", 0.59));
        products.add(new Product(3L, "Orange", 1.29));
        products.add(new Product(4L, "Milk", 2.49));
    }

    public List<Product> findAll() {
        return products;
    }

    public List<Product> searchByName(String query) {
        return products.stream()
                .filter(p -> p.getName().toLowerCase().contains(query.toLowerCase()))
                .collect(Collectors.toList());
    }
}
