package com.Amar.demoApp.entity;

import jakarta.persistence.Entity;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product extends BaseEntity {
    private String color;
    private String name;
    private int price;
    private String description;
    private String model;
    private String title;
    private String brand;
    private boolean popular;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;

}
