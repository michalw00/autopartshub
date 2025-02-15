package com.autopartshub.controller;

import com.autopartshub.model.Product;
import com.autopartshub.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController  {
	private final ProductService productService;

	public ProductController(ProductService productService) {
		this.productService = productService;
	}

	@GetMapping
	public List<Product> getAllProducts() {
		return productService.getAllProducts();
	}

	@PostMapping
	public Product createProduct(@RequestBody Product product) {
		return productService.saveProduct(product);
	}

}
