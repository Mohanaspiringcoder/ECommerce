package com.ecommerce.entity;

import javax.persistence.*;

@Entity
@Table(name ="productcategory")
public class Productcategory {
	@Id
	@Column(name = "categoryid")
	private Integer categoryid;
	
	@Column(name = "categoryname")
	private String categoryname;
	
	public Productcategory() {}

	public Productcategory(Integer categoryid, String categoryname) {
		this.categoryid = categoryid;
		this.categoryname = categoryname;
	}

	public Integer getCategoryid() {
		return categoryid;
	}

	public void setCategoryid(Integer categoryid) {
		this.categoryid = categoryid;
	}

	public String getCategoryname() {
		return categoryname;
	}

	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}
	
	

}
