package com.rikkeiacademy.demo_api_standard.repositoy;

import com.rikkeiacademy.demo_api_standard.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {
}
