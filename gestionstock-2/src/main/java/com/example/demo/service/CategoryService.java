package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.*;

public interface CategoryService {

	Category ajoutCategory(Category category);
	List<Category> getAll();
    Category updateCategory(Category category,int id_cat);
    void deleteCategory(int id_cat);
	Category findById(int id_cat);

	

}
