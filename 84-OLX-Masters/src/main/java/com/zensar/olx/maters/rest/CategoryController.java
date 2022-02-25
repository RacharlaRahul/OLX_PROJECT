package com.zensar.olx.maters.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.olx.maters.bean.Category;
import com.zensar.olx.maters.service.CategoryService;

@RestController
public class CategoryController {

	@Autowired
	CategoryService service;
	
	@PostMapping("/advertise/addCategory")
	public Category addCategory(@RequestBody Category category) {
		return this.service.addCategory(category);
	}
	
	@GetMapping("/advertise/category")
	public List<Category> getAllCategories() {
		return this.service.findAllCategories();
	}
	
	@GetMapping("/advertise/getCategory/{id}")
	public Category getCategory(@PathVariable(name="id") int id) {
		return this.service.findCategory(id);
	}
}
