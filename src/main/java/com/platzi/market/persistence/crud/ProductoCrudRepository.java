package com.platzi.market.persistence.crud;

import antlr.collections.List;
import com.platzi.market.persistence.entity.Producto;
import com.sun.el.stream.Optional;
import org.springframework.data.jpa.repository.Query;

public interface ProductoCrudRepository extends CrudRepository <Producto, Integer>{
    // esta sería la maera de implementar una query nativa
    //@Query(value = SELECT * FROM productos WHERE id_categoria = ?", nativeQuery = true)


    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);

    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado)




}
