package com.ecommerce.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.entity.Productcategory;
import com.ecommerce.repository.ProductcategoryRepository;

@Service
public class ProductcategoryServiceImplementation implements ProductcategoryService{
	
	@Autowired
	private ProductcategoryRepository productcategoryRepository;

	public List<Productcategory> findAll() {
		return productcategoryRepository.findAll();
	}

	
	public Productcategory findById(Integer id) {
		return productcategoryRepository.findById(id);
	}



	public void save(Productcategory pc) {
		productcategoryRepository.save(pc);
		
	}


	
	public void deleteById(Integer categoryid) {
		productcategoryRepository.deleteById(categoryid);
		
	}
}
