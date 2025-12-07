package com.Amar.demoApp.services;

import com.Amar.demoApp.Dto.CategoryDTO;

import java.util.List;

public interface ICategoryService {

   List<CategoryDTO> getCategories() throws Exception;

   CategoryDTO createCategory(CategoryDTO categoryDTO);
}
