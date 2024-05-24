package com.rikkeiacademy.demo_api_standard.controller;

import com.rikkeiacademy.demo_api_standard.entity.Product;
import com.rikkeiacademy.demo_api_standard.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping
    public ResponseEntity<Product> insertProduct(@Valid @RequestBody Product product){
        return new ResponseEntity<>(productService.save(product), HttpStatus.CREATED);
    }

    @PutMapping("/{proId}")
    public ResponseEntity<Product> updateProduct(@Valid @RequestBody Product product, @PathVariable Integer proId){
        return new ResponseEntity<>(productService.update(product, proId),HttpStatus.OK);
    }

    @GetMapping("/{proId}")
    public ResponseEntity<Product> getProductById(@PathVariable Integer proId){
        return new ResponseEntity<>(productService.getProductById(proId),HttpStatus.OK);
    }
}
