package org.example.java5n_sof3022_03.repository;

import org.example.java5n_sof3022_03.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
