package com.sunglowsys.repositories;

import com.sunglowsys.enties.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category, Integer> {
}
