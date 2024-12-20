package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping(
            value = "/create/{name}"
    )
    public ResponseEntity createProduct(@PathVariable String name) {
        productService.createProduct(name);
        return ResponseEntity
                .ok(
                        "Berhasil"
                );
    }
}
