package com.autopartshub.service;

import com.autopartshub.model.Product;
import com.autopartshub.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
	private final ProductRepository productRepository;

	public ProductService(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}

	public Product saveProduct(Product product) {
		return productRepository.save(product);
	}
}
