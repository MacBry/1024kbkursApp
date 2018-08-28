package com.mac.bry.kurs1024kb.entity;

import java.math.BigDecimal;


public class Product {
	
	private int id;
	private String productName;
	private BigDecimal price;
	private double weight;
	private String color;
	private int productCount;
	
	public Product(int id, String productName, BigDecimal price, double weight, String color, int productCount) {
		super();
		this.id = id;
		this.productName = productName;
		this.price = price;
		this.weight = weight;
		this.color = color;
		this.productCount = productCount;
	}


	public Product() {
		
	}


	public static class Builder  {
		
		protected int id;
		protected String productName;
		protected BigDecimal price;
		protected double weight;
		protected String color;
		protected int productCount;
		
		public Builder () {
			super();
		}
		
		public Builder setId (int id) {
			this.id = id;
			return this;
		}
		
		public Builder setProductName(String productName) {
			this.productName = productName;
			return this;
		}
		
		public Builder setPrice(BigDecimal price) {
			this.price = price;
			return this;
		}
		
		public Builder setWeight(double weight) {
			this.weight = weight;
			return this;
		}
		
		public Builder setColor(String color) {
			this.color = color;
			return this;
		}
		
		public Builder setProductCount(int productCount) {
			this.productCount = productCount;
			return this;
		}
		
		
		public Product build () {
			return new Product(id,productName,price,weight,color,productCount);
		}
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public int getProductCount() {
		return productCount;
	}

	public void setProductCount(int productCount) {
		this.productCount = productCount;
	}

	public int getId() {
		return id;
	}

	public String getProductName() {
		return productName;
	}

	public double getWeight() {
		return weight;
	}

	public String getColor() {
		return color;
	}

	@Override
	public String toString() {
		return  id + "#" + productName + "#" + price + "#" + weight
				+ "#" + color + "#" + productCount ;
	}
	
	 
	

}
