package com.ecommerce.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ecommerce.entity.Product;
import com.ecommerce.entity.Productcategory;

@Repository
public class ProductRepositoryImplementation implements ProductRepository{

	@Autowired
	EntityManager entityManager;
	
	public List<Product> findAll() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Product> query = currentSession.createQuery("select p from Product p",Product.class);
//		Query<Employee> query = currentSession.createQuery("select e from employee e",Employee.class);
		List<Product> productList = query.getResultList();
		return  productList;
	}

	@Override
	public Product findById(Integer id) {
		Session currentSession = entityManager.unwrap(Session.class);
		return currentSession.get(Product.class, id);
	}

	@Transactional
	public void save(Product p) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(p);
		
	}

	@Override
	public void deleteById(Integer id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Productcategory> query = currentSession.createQuery("delete from Product where id = : id",Productcategory.class);
		query.setParameter("id",id);
		query.executeUpdate();
		
	}

}
