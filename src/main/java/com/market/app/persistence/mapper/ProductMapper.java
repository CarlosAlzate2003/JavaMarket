package com.market.app.persistence.mapper;

import com.market.app.domain.Product;
import com.market.app.persistence.entity.ProductoEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {CategoryMapper.class})
public interface ProductMapper {
    @Mappings({
            @Mapping(source = "idProducto", target = "productoId"),
            @Mapping(source = "nombre", target = "name"),
            @Mapping(source = "idCategoria", target = "categoryId"),
            @Mapping(source = "precioVenta", target = "price"),
            @Mapping(source = "cantidadStock", target = "stock"),
            @Mapping(source = "estado", target = "active"),
            @Mapping(source = "categorias", target = "category")

    })
    Product toProduct(ProductoEntity producto);

    List<Product> toProducts(List<ProductoEntity> productos);

    @InheritInverseConfiguration
    @Mapping(target = "codigoBarras", ignore = true)
    ProductoEntity toProducto(Product product);
}
