package com.Amar.demoApp.services;

import com.Amar.demoApp.Dto.CategoryDTO;
import com.Amar.demoApp.Mapper.CategoryMapper;
import com.Amar.demoApp.Mapper.ProductMapper;
import com.Amar.demoApp.entity.Category;
import com.Amar.demoApp.entity.Product;
import com.Amar.demoApp.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class CategoryService implements ICategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<CategoryDTO> getCategories() throws Exception {
       return categoryRepository.findAll()
               .stream()
               .map(CategoryMapper:: toDTO)
               .toList();

    }

    @Override
    public CategoryDTO createCategory(CategoryDTO categoryDTO) {
        Category saved = categoryRepository.save(CategoryMapper.toEntity(categoryDTO));
        return CategoryMapper.toDTO(saved);
    }


}
