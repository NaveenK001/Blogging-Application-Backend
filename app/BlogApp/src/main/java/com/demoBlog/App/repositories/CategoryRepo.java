package com.demoBlog.App.repositories;

import com.demoBlog.App.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category, Integer> {
}
