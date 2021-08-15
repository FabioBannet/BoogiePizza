package com.boogiepizza.BoogiePizza.services;

import com.boogiepizza.BoogiePizza.dto.AddProdTypeDTO;
import com.boogiepizza.BoogiePizza.dto.EditProdTypeDTO;
import com.boogiepizza.BoogiePizza.dto.EditProductDTO;
import com.boogiepizza.BoogiePizza.models.Product;
import com.boogiepizza.BoogiePizza.models.ProductType;

import java.util.List;

public interface IProductTypeService {
    List<ProductType> getAll();
    ProductType get(Integer id);
    ProductType post(AddProdTypeDTO prodTypeDTO);
    ProductType put(EditProdTypeDTO prodTypeDTO);
    boolean delete(Integer id);

}
