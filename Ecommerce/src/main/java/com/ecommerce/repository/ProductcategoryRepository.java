package com.ecommerce.repository;

import java.util.List;
import com.ecommerce.entity.Productcategory;

public interface ProductcategoryRepository {
	public List<Productcategory> findAll();
	public Productcategory findById(Integer id);
	public void save(Productcategory pc);
	public void deleteById(Integer id);
}
