package com.platzi.market.domain.repository;


import antlr.collections.List;
import com.platzi.market.domain.Product;
import com.sun.el.stream.Optional;

package com.platzi.market.domain.repository;

public interface ProductRepository {

    List<Product> getAll();
    Optional<List<Product>> getByCategory(int categoryId);
    Optional<List<Product>> getScarseProducts(int quantity);
    Optional<Product> getProduct(int productId);
    Product save(Product product);
    void delete(int productId);


}
