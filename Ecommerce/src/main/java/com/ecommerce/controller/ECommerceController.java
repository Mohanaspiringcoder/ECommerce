package com.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.entity.Product;
import com.ecommerce.entity.Productcategory;
import com.ecommerce.service.ProductService;
import com.ecommerce.service.ProductcategoryService;

@RestController
@RequestMapping("/product")
public class ECommerceController {
	@Autowired 
	private ProductService productService;
	
	@GetMapping("/productList")
	public List<Product> findAll(){
		return productService.findAll();
	}
	
	@Autowired 
	private ProductcategoryService productcategoryService;
	
	@GetMapping("/productcategoryList")
	public List< Productcategory> displayDepartment(){
		return productcategoryService.findAll();
	}
	
	@GetMapping("/product/{id}")
	public Product showProductById(@PathVariable Integer id) throws Exception {
		Product product = productService.findById(id);
		
		if(product==null) {
			throw new Exception("Product With Id "+id+" Details Not Found");
		}
		
		return product;
	}
	
	@GetMapping("/productCategory/{categoryid}")
	public Productcategory showProductCategoryById(@PathVariable Integer categoryid) throws Exception {
		Productcategory productCategory = productcategoryService.findById(categoryid);
		
		if(productCategory ==null) {
			throw new Exception("ProductCategory  With Id "+categoryid+" Details Not Found");
		}
		
		return productCategory;
	}
	
	@PostMapping("/products")
	public Product save(@RequestBody Product p) {
		productService.save(p);
		return p;
	}
	

	@PostMapping("/productsCategory")
	public Productcategory save(@RequestBody Productcategory pc) {
		 productcategoryService.save(pc);
		return pc;
	}
	
	@PutMapping("/productupdate")
	public Product update(@RequestBody Product  p) {
		productService.save(p);
		return p;
	}
	
	@DeleteMapping("/productDelete/{id}")
	public String delete(@PathVariable Integer id) throws Exception {
		Product p = productService.findById(id);
		if(p==null) {
			throw new Exception("Product with id "+ id+" Not Available");
		}
		
		productService.deleteById(id);
		return "Product id "+id+" details has been deleted";
	}
	
	@DeleteMapping("/productCategoryDelete/{categoryid}")
	public String deleteCategory(@PathVariable Integer categoryid) throws Exception {
		Product p = productService.findById(categoryid);
		if(p==null) {
			throw new Exception("Product with id "+ categoryid+" Not Available");
		}
		
		productcategoryService.deleteById(categoryid);
		return "Product id "+categoryid+" details has been deleted";
	}
	
	
	
}
