package com.infy.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Product")
public class Product {
	@Id
	@Column(name="Pid")
	int prodId;
	@Column(name="Pname")
	String prodName;
	@Column(name="Prate")
    int prodRate;
	@Column(name="Pqnt")
	int prodQnt;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int prodId, String prodName, int prodRate, int prodQnt) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodRate = prodRate;
		this.prodQnt = prodQnt;
	}
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public int getProdRate() {
		return prodRate;
	}
	public void setProdRate(int prodRate) {
		this.prodRate = prodRate;
	}
	public int getProdQnt() {
		return prodQnt;
	}
	public void setProdQnt(int prodQnt) {
		this.prodQnt = prodQnt;
	}
	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodName=" + prodName + ", prodRate=" + prodRate + ", prodQnt="
				+ prodQnt + "]";
	}
	
	

}
