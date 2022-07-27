package com.ecommerce.service;

import java.util.List;

import com.ecommerce.entity.Product;

public interface ProductService {
	public List<Product> findAll();
	public Product findById(Integer id);
	public void save(Product p);
	public void deleteById(Integer id);
	

}
