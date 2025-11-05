package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;

	public List<Product> getProductList() {
		List<Product> listProduct=productRepository.findAll();
		return listProduct;
	}

	public Product saveProduct(Product product) {
		Product savedProduct=productRepository.save(product);
		return savedProduct;
	}

}
