package com.example.demo;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor

public class ProductService {

    @Autowired
    private IProductRepository productRepository;

    public void createProduct(String name){
        var product = Product.builder()
                .name(name)
                .build();

        productRepository.save(product);
    }
}
