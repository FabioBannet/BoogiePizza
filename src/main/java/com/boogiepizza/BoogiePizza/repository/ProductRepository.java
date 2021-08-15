package com.boogiepizza.BoogiePizza.repository;

import com.boogiepizza.BoogiePizza.models.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Integer> {
    @Query(value = "SELECT * FROM public.product WHERE product_type_id = ?1", nativeQuery = true)
    List<Product> findAllByProdType(Integer productTypeId);
}
