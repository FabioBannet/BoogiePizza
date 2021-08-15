package com.boogiepizza.BoogiePizza.services;

import com.boogiepizza.BoogiePizza.dto.AddProductDTO;
import com.boogiepizza.BoogiePizza.dto.EditProductDTO;
import com.boogiepizza.BoogiePizza.models.Product;

import java.util.List;

public interface IProductService {
    List<Product> getAll();
    List<Product> getAllByProductTypeId(Integer productTypId);
    Product get(Integer id);
    Product addProduct(AddProductDTO addProductDTO);
    Product editProduct(EditProductDTO editProductDTO);
    boolean delete(Integer id);
}
