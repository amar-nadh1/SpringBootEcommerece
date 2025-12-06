package com.Amar.demoApp.services;

import com.Amar.demoApp.Dto.ProductDTO;
import com.Amar.demoApp.Mapper.ProductMapper;
import com.Amar.demoApp.entity.Product;
import com.Amar.demoApp.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService {

    private final ProductRepository productRepository;


    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    public ProductRepository getProductRepository() {
        return productRepository;
    }

    @Override
    public ProductDTO getProductById(Long id) throws Exception {
        return productRepository.findById(id)
                .map(ProductMapper:: toDTO)
                .orElseThrow(() -> new Exception("Product not found with id: " + id));
    }
    @Override
    public ProductDTO createProduct(ProductDTO productDTO) throws Exception {
       Product saved = productRepository.save(ProductMapper.toEntity(productDTO));
         return ProductMapper.toDTO(saved);
    }
}
