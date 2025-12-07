package com.Amar.demoApp.controller;

import com.Amar.demoApp.Dto.CategoryDTO;
import com.Amar.demoApp.entity.Category;
import com.Amar.demoApp.services.ICategoryService;
import org.hibernate.mapping.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/api/categories")


public class CategoryController {
    private final ICategoryService categoryService;
    public CategoryController(ICategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping()
   public ResponseEntity<java.util.List<CategoryDTO>> getCategories() throws Exception {
       java.util.List<CategoryDTO> result = categoryService.getCategories();
       return ResponseEntity.ok(result);
   }
   @PostMapping("/create")
    public ResponseEntity<CategoryDTO> createCategory(@RequestBody CategoryDTO categoryDTO) throws Exception {
        categoryService.createCategory(categoryDTO);
        return ResponseEntity.ok(categoryDTO);
   }
}
