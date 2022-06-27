package com.infy.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.dto.Product;
import com.infy.repository.ProductRepoImpl;



@Service
@Transactional
public class ProductServiceImpl {
	@Autowired
	ProductRepoImpl Dao;

	public void addProduct(Product p) {
	Dao.addProduct(p);

	}

	



}
