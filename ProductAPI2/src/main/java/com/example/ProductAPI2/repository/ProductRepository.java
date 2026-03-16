package com.example.ProductAPI2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ProductAPI2.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}