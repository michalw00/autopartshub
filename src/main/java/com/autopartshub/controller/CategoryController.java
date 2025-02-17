package com.autopartshub.controller;

import com.autopartshub.model.Category;
import com.autopartshub.service.CategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {
	private final CategoryService categoryService;

	public CategoryController(CategoryService categoryService) {
		this.categoryService = categoryService;
	}

	@GetMapping
	public List<Category> getAllProducts() {
		return categoryService.getAllCategories();
	}

	@PostMapping
	public Category createProduct(@RequestBody Category category) {
		return categoryService.saveCategory(category);
	}

}
