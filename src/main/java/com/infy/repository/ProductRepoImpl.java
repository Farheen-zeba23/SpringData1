package com.infy.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.infy.dto.Product;
@Repository
public  class ProductRepoImpl{
	@PersistenceContext
	EntityManager Em;
	public void addProduct(Product p) {
		Em.persist(p);
	}
	
}
