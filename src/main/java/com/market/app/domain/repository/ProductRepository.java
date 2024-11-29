package com.market.app.domain.repository;

import com.market.app.domain.Product;
import com.market.app.persistence.entity.ProductoEntity;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {
    List<ProductoEntity> getAll();
    Optional<List<Product>> getByCategory(int categoryId);
    Optional<List<Product>> getScarseProducts(int quantity);
    Optional<Product> getProduct (int productId);
    Product save(Product product);
    void delete(int productId);
}
