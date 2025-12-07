package com.Amar.demoApp.repository;

import com.Amar.demoApp.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface CategoryRepository extends JpaRepository<com.Amar.demoApp.entity.Category, Long> {


}
