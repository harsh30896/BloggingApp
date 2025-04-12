package com.blogApp.blogApp.repository;

import com.blogApp.blogApp.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
