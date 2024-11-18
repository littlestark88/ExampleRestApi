package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository  extends JpaRepository<Product, Long> {
}
