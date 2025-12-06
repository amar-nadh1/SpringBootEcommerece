package com.Amar.demoApp.services;

import com.Amar.demoApp.Dto.ProductDTO;

public interface IProductService {

    ProductDTO getProductById(Long id) throws Exception;

    ProductDTO createProduct(ProductDTO productDTO) throws Exception;
}
