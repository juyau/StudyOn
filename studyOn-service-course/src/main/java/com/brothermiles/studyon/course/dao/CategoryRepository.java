package com.brothermiles.studyon.course.dao;


import com.brothermiles.studyon.model.course.Category;
import org.springframework.data.jpa.repository.JpaRepository;



public interface CategoryRepository extends JpaRepository<Category,String> {

}
