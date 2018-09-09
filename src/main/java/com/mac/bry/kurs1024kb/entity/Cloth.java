package com.mac.bry.kurs1024kb.entity;

import java.math.BigDecimal;



public class Cloth extends Product {
	private int size;
	private String material;
	
	public Cloth(int id, String productName, BigDecimal price, double weight, String color, int productCount, int size,
			String material) {
		super(id, productName, price, weight, color, productCount);
		this.size = size;
		this.material = material;
	}
	
public static class ClothBuilder extends Product.Builder {
		
		protected int size;
		protected String  material;
		
		public ClothBuilder () {
			
		}
		
		public ClothBuilder setSize(int size) {
			this.size = size;
			return this;
		}
		public ClothBuilder setMaterial(String material) {
			this.material = material;
			return this;
		}
		
		@Override
		public Cloth build () {
			return new Cloth(id,productName,price,weight,color,productCount,size,material);
		}
	}

	public int getSize() {
		return size;
	}

	public String getMaterial() {
		return material;
	}

	@Override
	public String toString() {
		return   size + "#" + material + "#" + super.toString();
	}
	
	
}
