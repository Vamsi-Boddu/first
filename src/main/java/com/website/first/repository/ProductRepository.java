package com.website.first.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.website.first.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
