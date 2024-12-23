package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.entity.Category;
import com.example.demo.service.CategoryService;
import com.example.demo.service.*;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/category")
public class CategoryController {

	@Autowired
	private CategoryService categoryservice;
	
	/*@PostMapping(path="/ajout")
	public String ajoutCategory(CategoryDTOsave categoryDTOsave){
		String nom = categoryservice.ajoutCategory(categoryDTOsave);
	}*/
	
	 @PostMapping("/ajout")
	 public Category saveCategory(
		         @RequestBody Category category)
		    {
		        return categoryservice.ajoutCategory(category);
		    }
	 
	 @GetMapping("/all")
	    public List<Category> getAll()
	    {
	        return categoryservice.getAll();
	    }
	 
	 @PutMapping("/update/{id}")
	    public Category
	    updateDepartment(@RequestBody Category category,
	                     @PathVariable("id") int id_cat)
	    {
	        return categoryservice.updateCategory(
	            category, id_cat);
	    }
	 
	 @DeleteMapping("/delete/{id}")
	    public String deleteCategoryById(@PathVariable("id")
	                                       int id_cat)
	    {
		 categoryservice.deleteCategory(
				 id_cat);
	        return "category supprimé";
	    }
	 
}
