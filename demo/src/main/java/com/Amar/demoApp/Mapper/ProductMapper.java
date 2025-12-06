package com.Amar.demoApp.Mapper;

import com.Amar.demoApp.Dto.ProductDTO;
import com.Amar.demoApp.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


public class ProductMapper {

    public static ProductDTO toDTO(Product product) {
        return ProductDTO.builder()
                .color(product.getColor())
                .name(product.getName())
                .price(product.getPrice())
                .description(product.getDescription())
                .model(product.getModel())
                .title(product.getTitle())
                .brand(product.getBrand())
                .popular(product.isPopular())
                .build();
    }

    public static Product toEntity(ProductDTO productDTO) {
        Product product = new Product();
        product.setColor(productDTO.getColor());
        product.setName(productDTO.getName());
        product.setPrice(productDTO.getPrice());
        product.setDescription(productDTO.getDescription());
        product.setModel(productDTO.getModel());
        product.setTitle(productDTO.getTitle());
        product.setBrand(productDTO.getBrand());
        product.setPopular(productDTO.isPopular());
        return product;
    }
}
