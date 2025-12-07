package com.Amar.demoApp.Mapper;

import com.Amar.demoApp.Dto.CategoryDTO;
import com.Amar.demoApp.entity.Category;

public class CategoryMapper {

    public static CategoryDTO toDTO(Category category){
        CategoryDTO categoryDTO = new CategoryDTO();
        categoryDTO.setName(category.getName());
        return categoryDTO;
    }

    public static Category toEntity(CategoryDTO categoryDTO){
        Category category = new Category();
        category.setName(categoryDTO.getName());
        return category;
    }
}
