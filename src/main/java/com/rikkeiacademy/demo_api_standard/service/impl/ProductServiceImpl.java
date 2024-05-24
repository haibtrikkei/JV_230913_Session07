package com.rikkeiacademy.demo_api_standard.service.impl;

import com.rikkeiacademy.demo_api_standard.entity.Product;
import com.rikkeiacademy.demo_api_standard.repositoy.ProductRepository;
import com.rikkeiacademy.demo_api_standard.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.annotation.Annotation;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;


    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product update(Product product, Integer proId) {
        Product pro = productRepository.findById(proId).orElseThrow(() -> new NoSuchElementException("Product Id khong ton tai"));
        if(pro!=null){
            pro.setProName(product.getProName());
            pro.setProId(product.getProId());
            pro.setPrice(product.getPrice());
            pro.setProducer(product.getProducer());
            pro.setYearMaking(product.getYearMaking());
            productRepository.save(pro);
        }
        return null;
    }

    @Override
    public Product getProductById(Integer proId) {
        return productRepository.findById(proId).orElseThrow(() -> new NoSuchElementException("Product Id khong ton tai"));
    }
}
