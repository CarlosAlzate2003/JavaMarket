package com.market.app.persistence.mapper;

import com.market.app.domain.Category;
import com.market.app.persistence.entity.CategoriasEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    @Mappings({
            @Mapping(source = "idCategoria", target = "categoryId"),
            @Mapping(source = "descripcion", target = "category"),
            @Mapping(source = "estado", target = "active")

    })
    Category toCategory(CategoriasEntity categoria);

    @InheritInverseConfiguration
    @Mapping(target = "productos", ignore = true)
    CategoriasEntity toCategoryModel(Category category);
}
