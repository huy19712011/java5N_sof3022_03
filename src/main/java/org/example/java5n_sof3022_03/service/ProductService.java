package org.example.java5n_sof3022_03.service;

import lombok.RequiredArgsConstructor;
import org.example.java5n_sof3022_03.entity.Product;
import org.example.java5n_sof3022_03.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public List<Product> getAllProducts() {

        return productRepository.findAll();
    }
}
