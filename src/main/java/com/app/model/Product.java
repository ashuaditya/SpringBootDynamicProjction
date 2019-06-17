package com.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "prodstaticprojection")
public class Product {

	@Id
	private Integer prodId;
	private String prodCode;
	private Double prodCost;
	private String prodModel;
	private String prodVendor;
	
	public Product() {
		super();
	}
	public Product(String prodCode, Double prodCost, String prodModel, String prodVendor) {
		super();
		this.prodCode = prodCode;
		this.prodCost = prodCost;
		this.prodModel = prodModel;
		this.prodVendor = prodVendor;
	}
	public Product(Integer prodId, String prodCode, Double prodCost, String prodModel, String prodVendor) {
		super();
		this.prodId = prodId;
		this.prodCode = prodCode;
		this.prodCost = prodCost;
		this.prodModel = prodModel;
		this.prodVendor = prodVendor;
	}
	public Integer getProdId() {
		return prodId;
	}
	public void setProdId(Integer prodId) {
		this.prodId = prodId;
	}
	public String getProdCode() {
		return prodCode;
	}
	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}
	public Double getProdCost() {
		return prodCost;
	}
	public void setProdCost(Double prodCost) {
		this.prodCost = prodCost;
	}
	public String getProdModel() {
		return prodModel;
	}
	public void setProdModel(String prodModel) {
		this.prodModel = prodModel;
	}
	public String getProdVendor() {
		return prodVendor;
	}
	public void setProdVendor(String prodVendor) {
		this.prodVendor = prodVendor;
	}
	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodCode=" + prodCode + ", prodCost=" + prodCost + ", prodModel="
				+ prodModel + ", prodVendor=" + prodVendor + "]";
	}
	
	
	
	
}
