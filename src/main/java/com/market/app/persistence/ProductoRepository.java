package com.market.app.persistence;

import com.market.app.domain.Product;
import com.market.app.domain.repository.ProductRepository;
import com.market.app.persistence.crud.ProductoCrudRepository;
import com.market.app.persistence.entity.ProductoEntity;
import com.market.app.persistence.mapper.ProductMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ProductoRepository implements ProductRepository {

    private ProductoCrudRepository productoCrudRepository;
    private ProductMapper mapper;

    public List<ProductoEntity> getAll(){
        return (List<ProductoEntity>) productoCrudRepository.findAll();
    }

    @Override
    public Optional<List<Product>> getByCategory(int categoryId) {
        return Optional.empty();
    }

    @Override
    public Optional<List<Product>> getScarseProducts(int quantity) {
        return Optional.empty();
    }

    @Override
    public Optional<Product> getProduct(int productId) {
        return Optional.empty();
    }

    @Override
    public Product save(Product product) {
        return null;
    }

    public List<ProductoEntity> getByCategoria(int idCategoria){
        return productoCrudRepository.findByIdCategoriaOrderByNombreAsc(idCategoria);
    }

    public Optional<List<ProductoEntity>> getEscasos(int cantidad, boolean estado){
        return productoCrudRepository.findByCantidadStockLessThanAndEstado(cantidad, true);
    }

    public Optional<ProductoEntity> getProducto(int idProducto){
        return productoCrudRepository.findById(idProducto);
    }

    public ProductoEntity save(ProductoEntity producto){
        return productoCrudRepository.save(producto);
    }

    public void delete(int idProducto){
        productoCrudRepository.deleteById(idProducto);
    }

}
