package com.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.ecommerce.entity.Product;


@RepositoryRestController(path ="/productList")
@CrossOrigin("http://localhost:4200/")
public interface ProductRepository extends JpaRepository<Product,Integer>{

}
