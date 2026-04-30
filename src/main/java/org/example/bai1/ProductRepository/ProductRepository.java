package org.example.bai1.ProductRepository;

import org.example.bai1.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findByCategoryAndPriceLessThanEqualAndStockQuantityGreaterThan(
            String category, Double maxPrice, Integer stockQuantity);
}