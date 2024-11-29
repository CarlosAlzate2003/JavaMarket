package com.market.app.persistence.crud;

import com.market.app.persistence.entity.ProductoEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<ProductoEntity, Integer> {

    List<ProductoEntity> findByIdCategoriaOrderByNombreAsc(int idCategoria);

    Optional<List<ProductoEntity>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);
}
