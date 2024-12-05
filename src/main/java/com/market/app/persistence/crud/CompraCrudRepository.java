package com.market.app.persistence.crud;

import com.market.app.persistence.entity.CompraEntity;
import org.springframework.data.repository.CrudRepository;

public interface CompraCrudRepository extends CrudRepository<CompraEntity, Integer> {
}
