/*
* Esta clase permite realizar una conversion de nuestros registros para el ingles
*
* */


package com.platzi.market.persistence.mapper;

import com.platzi.market.domain.Category;
import com.platzi.market.persistence.entity.Categoria;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    @Mappings({
            @Mappings(source = "idCategoria", target = "categoryId")
            @Mappings(source = "descripcion", target = "category")
            @Mappings(source = "estado", target = "active")

    })

    Category toCategory(Categoria categoria);

    // esta definicion declara el mapeo inverso a los mappigns que hemos declarado, por lo tanto no debemos volver a
    // crear otros mappings.

    @InheritInverseConfiguration
    @Mappings(target = "productos", ignore = true)
    Categoria toCategoria(Category category);



}
