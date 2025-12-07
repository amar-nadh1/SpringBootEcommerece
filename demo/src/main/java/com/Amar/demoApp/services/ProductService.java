package com.Amar.demoApp.services;

import com.Amar.demoApp.Dto.ProductDTO;
import com.Amar.demoApp.Mapper.ProductMapper;
import com.Amar.demoApp.entity.Category;
import com.Amar.demoApp.entity.Product;
import com.Amar.demoApp.repository.CategoryRepository;
import com.Amar.demoApp.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService {

    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;


    public ProductService(ProductRepository productRepository, CategoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public ProductDTO getProductById(Long id) throws Exception {
        return productRepository.findById(id)
                .map(ProductMapper:: toDTO)
                .orElseThrow(() -> new Exception("Product not found with id: " + id));
    }
    @Override
    public ProductDTO createProduct(ProductDTO productDTO) throws Exception {
        Category category = categoryRepository.findById(productDTO.getCategoryId())
                .orElseThrow(() -> new Exception("Category not found with id: " + productDTO.getCategoryId()));
       Product saved = productRepository.save(ProductMapper.toEntity(productDTO, category));
         return ProductMapper.toDTO(saved);
    }
}
