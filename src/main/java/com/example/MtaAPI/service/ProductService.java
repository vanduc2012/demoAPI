package com.example.MtaAPI.service;

import com.example.MtaAPI.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<Product> findAllProduct();

    Optional<Product> findById(Long id);

    void save(Product product);

    void remove(Product product);
}
