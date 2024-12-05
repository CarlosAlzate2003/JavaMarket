package com.market.app.persistence;

import com.market.app.domain.Purchase;
import com.market.app.domain.repository.PurchaseRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CompraRepository implements PurchaseRepository {
    @Override
    public List<Purchase> getAll() {
        return List.of();
    }

    @Override
    public Optional<List<Purchase>> getByClient(String clientId) {
        return Optional.empty();
    }

    @Override
    public Purchase save(Purchase purchase) {
        return null;
    }
}
