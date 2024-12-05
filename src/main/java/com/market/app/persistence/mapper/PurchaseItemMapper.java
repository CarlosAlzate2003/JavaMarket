package com.market.app.persistence.mapper;

import ch.qos.logback.core.model.ComponentModel;
import com.market.app.domain.PurchaseItem;
import com.market.app.persistence.entity.ComprasProductoEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface PurchaseItemMapper {

    @Mappings({
            @Mapping(source = "id.idProducto", target = "productId"),
            @Mapping(source = "cantidad", target = "quantity"),
            @Mapping(source = "total", target = "total"),
            @Mapping(source = "estado", target = "active")

    })

    PurchaseItem toPurchaseItem(ComprasProductoEntity producto);

    @InheritInverseConfiguration
    @Mappings({
            @Mapping(target = "compra", ignore = true),
            @Mapping(target = "producto", ignore = true),
            @Mapping(target = "id.idCompra", ignore = true)
    })
    ComprasProductoEntity toComprasProducto(PurchaseItem item);
}
