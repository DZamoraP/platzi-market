package com.platzi.market.persistence.mapper;

import com.platzi.market.domain.Product;
import com.platzi.market.persistence.entity.Producto;
import com.sun.xml.bind.v2.schemagen.xmlschema.List;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mappings;
import org.springframework.web.bind.annotation.Mapping;

@Mapper(componentModel = "spring", uses = {CategoryMapper.class})
public interface ProductMapper {


    @Mappings({
            @Mapping(sourse = "idProducto", target = "productId"),
            @Mapping(sourse = "nombre", target = "name"),
            @Mapping(sourse = "idCategoria", target = "categoryId"),
            @Mapping(sourse = "precioVenta", target = "price"),
            @Mapping(sourse = "cantidadStock", target = "stock"),
            @Mapping(sourse = "estado", target = "active"),
            @Mapping(sourse = "categoria", target = "category"),
    })


    Product toProduct(Producto producto);
    List<Product> toProducts(List<Producto> productos);

    @InheritInverseConfiguration
    @Mappings(target = "codigoBarras", ignore = true)
    Producto toProducto(Product product);

}
