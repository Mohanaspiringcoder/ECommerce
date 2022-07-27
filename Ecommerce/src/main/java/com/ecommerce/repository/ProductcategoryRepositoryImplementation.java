package com.ecommerce.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.ecommerce.entity.Productcategory;

@Repository
public class ProductcategoryRepositoryImplementation implements ProductcategoryRepository {
	@Autowired
	EntityManager entityManager;
	
	public List<Productcategory> findAll() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Productcategory> query = currentSession.createQuery("select pc from Productcategory pc",Productcategory.class);
		
//		Query<Employee> query = currentSession.createQuery("select e from employee e",Employee.class);
		List<Productcategory> productCategoryList = query.getResultList();
		return  productCategoryList;
	}

	@Override
	public Productcategory findById(Integer id) {
		Session currentSession = entityManager.unwrap(Session.class);
		return currentSession.get(Productcategory.class, id);

	}

	@Transactional
	public void save(Productcategory pc) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(pc);
		
	}

	@Override
	public void deleteById(Integer categoryid) {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Productcategory> query = currentSession.createQuery("delete from Productcategory where categoryid = : categoryid",Productcategory.class);
		query.setParameter("categoryid",categoryid);
		query.executeUpdate();
		
	}

}
