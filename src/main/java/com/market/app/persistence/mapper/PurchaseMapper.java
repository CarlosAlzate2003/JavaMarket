package com.market.app.persistence.mapper;

import com.market.app.domain.Purchase;
import com.market.app.persistence.entity.CompraEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {PurchaseItemMapper.class})
public interface PurchaseMapper {

    @Mappings({
            @Mapping(source = "idCompra", target = "purchaseId"),
            @Mapping(source = "idCliente", target = "clientId"),
            @Mapping(source = "fecha", target = "date"),
            @Mapping(source = "medioPago", target = "paymentMethod"),
            @Mapping(source = "comentario", target = "comment"),
            @Mapping(source = "estado", target = "status"),
            @Mapping(source = "productos", target = "items")


    })
    Purchase toPurchase(CompraEntity compra);
    List<Purchase> toPurchases(List<CompraEntity> compras);

    @InheritInverseConfiguration
    @Mapping(target = "cliente", ignore = true)

    CompraEntity toCompra(Purchase purchase);
}
