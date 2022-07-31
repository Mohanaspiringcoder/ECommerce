package com.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.ecommerce.entity.Productcategory;

@RepositoryRestController(path="/productCategory")
@CrossOrigin("http://localhost:4200/")
public interface ProductCategoryRepository extends JpaRepository<Productcategory,Integer> {

}
