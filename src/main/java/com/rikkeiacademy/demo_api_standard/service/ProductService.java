package com.rikkeiacademy.demo_api_standard.service;

import com.rikkeiacademy.demo_api_standard.entity.Product;

public interface ProductService {
    public Product save(Product product);
    public Product update(Product product, Integer proId);
    public Product getProductById(Integer proId);
}
