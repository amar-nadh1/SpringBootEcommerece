package com.Amar.demoApp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class Category extends BaseEntity {
    private String name;
    @OneToMany(mappedBy = "category")
    private List<Product> products;
}
