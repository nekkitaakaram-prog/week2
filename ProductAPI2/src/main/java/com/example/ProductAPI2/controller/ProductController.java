package com.example.ProductAPI2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.ProductAPI2.entity.Product;
import com.example.ProductAPI2.repository.ProductRepository;

import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductRepository repo;

    // Task 6.1 ADD PRODUCT
    @PostMapping("/add")
    public Product addProduct(@RequestBody Product p) {
        return repo.save(p);
    }

    // Task 6.1 GET ALL PRODUCTS
    @GetMapping("/all")
    public List<Product> getAllProducts() {
        return repo.findAll();
    }

    // Task 6.2 GET PRODUCT BY ID
    @GetMapping("/{id}")
    public Product getProduct(@PathVariable int id) {
        return repo.findById(id).orElse(null);
    }

    // Task 6.3 UPDATE PRODUCT
    @PutMapping("/update/{id}")
    public Product updateProduct(@PathVariable int id, @RequestBody Product p) {
        p.setId(id);
        return repo.save(p);
    }

    // Task 6.3 DELETE PRODUCT
    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id) {
        repo.deleteById(id);
        return "Product Deleted";
    }

    // Task 6.4 REQUEST PARAM
    @GetMapping("/search")
    public ResponseEntity<String> searchProduct(@RequestParam String name) {
        return ResponseEntity.ok("Searching product: " + name);
    }

    // Task 6.4 RESPONSE ENTITY
    @GetMapping("/details/{id}")
    public ResponseEntity<Product> getProductDetails(@PathVariable int id) {

        Product p = repo.findById(id).orElse(null);

        if (p == null) {
            return ResponseEntity.status(404).body(null);
        }

        return ResponseEntity.ok(p);
    }
}