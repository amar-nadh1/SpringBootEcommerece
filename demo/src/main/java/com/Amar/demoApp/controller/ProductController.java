package com.Amar.demoApp.controller;

import com.Amar.demoApp.Dto.ProductDTO;
import com.Amar.demoApp.services.IProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RestController
@RequestMapping("/v1/api/products")

public class ProductController {

    private final IProductService productService;

    public ProductController(IProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductDTO> hello(@PathVariable Long id) throws Exception{
        ProductDTO result = productService.getProductById(id);
        return ResponseEntity.ok(result);
    }
    @PostMapping("/create")
    public ResponseEntity<ProductDTO> createProduct( @RequestBody  ProductDTO productDTO) throws Exception{
        ProductDTO result = productService.createProduct(productDTO);
        return ResponseEntity.ok(result);
    }
}
