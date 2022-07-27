package com.ecommerce.service;
import java.util.List;

import com.ecommerce.entity.Productcategory;


public interface ProductcategoryService {
	public List<Productcategory> findAll();
	public Productcategory findById(Integer categoryid);
	public void save(Productcategory p);
	public void deleteById(Integer categoryid);
	
	
}
