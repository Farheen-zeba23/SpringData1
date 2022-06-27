package com.infy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.infy.dto.Product;
import com.infy.service.ProductServiceImpl;

@SpringBootApplication
public class SpringData1Application implements CommandLineRunner {
	@Autowired
	ProductServiceImpl service;

	public static void main(String[] args) {
		SpringApplication.run(SpringData1Application.class, args);
	
	}

	@Override
	public void run(String... args) throws Exception {
		addProduct();
		//delProduct();
		
		
	}

	private void addProduct() {
		 //TODO Auto-generated method stub
		Product p=new Product(1,"Biryani",70,2);
		service.addProduct(p);
		
		
	}
	

}
