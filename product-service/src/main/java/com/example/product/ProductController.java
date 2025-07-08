package com.example.product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/products")
    public String getProducts() {
        return "List of products";
    }

    @GetMapping("/product/search")
    public List<Product> searchProducts(@RequestParam("q") String query) {
        return productRepository.searchByName(query);
    }
}
