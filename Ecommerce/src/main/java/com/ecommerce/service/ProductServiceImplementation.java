package com.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.entity.Product;
import com.ecommerce.repository.ProductRepository;

@Service
public class ProductServiceImplementation implements ProductService{

	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> findAll() {
		return productRepository.findAll();
	}

	@Override
	public Product findById(Integer id) {
		return productRepository.findById(id);
	}

	@Override
	public void save(Product p) {
		productRepository.save(p);
		
	}

	
	public void deleteById(Integer id) {
		productRepository.deleteById(id);
		
	}

}
