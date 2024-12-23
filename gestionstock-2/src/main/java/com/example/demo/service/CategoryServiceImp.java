package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.repository.CategoryRepo;
import com.example.demo.entity.*;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
@Service
public class CategoryServiceImp implements CategoryService {

	@Autowired
	private CategoryRepo categoryRepo;
	
	@Override
	public Category ajoutCategory(Category category) {
		// TODO Auto-generated method stub
		 return categoryRepo.save(category);
	}

	@Override
	public List<Category> getAll() {
		// TODO Auto-generated method stub
		return (List<Category>)
				categoryRepo.findAll();
	}

	@Override
	public Category updateCategory(Category category, int id_cat) {
		// TODO Auto-generated method stub
		Category c
        = categoryRepo.findById(id_cat)
              .get();

    if (Objects.nonNull(category.getNom())
        && !"".equalsIgnoreCase(
        		category.getNom())) {
        c.setNom(
        		c.getNom());
        }
        	return categoryRepo.save(c);
    }

	@Override
	public void deleteCategory(int id_cat) {
		// TODO Auto-generated method stub
		categoryRepo.deleteById(id_cat);
	}

	@Override
	public Category findById(int id_cat) {
		// TODO Auto-generated method stub
		 Optional<Category> category = categoryRepo.findById(id_cat);
	        return category.orElse(null);
	}
	

}
