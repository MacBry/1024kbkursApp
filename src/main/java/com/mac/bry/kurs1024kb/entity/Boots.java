package com.mac.bry.kurs1024kb.entity;

import java.math.BigDecimal;

public class Boots extends Product {

	private int size;
	private boolean isNaturalSkin;
	
	
	public Boots(int id, String productName, BigDecimal price, double weight, String color, int productCount, int size,
			boolean isNaturalSkin) {
		super(id, productName, price, weight, color, productCount);
		this.size = size;
		this.isNaturalSkin = isNaturalSkin;
	}
	
	public static class BootsBuilder extends Product.Builder {
		
		protected int size;
		protected boolean isNaturalSkin;
		
		public BootsBuilder () {
			
		}
		
		public BootsBuilder setSize(int size) {
			this.size = size;
			return this;
		}
		public BootsBuilder setIsNaturalSkin(boolean isNaturalSkin) {
			this.isNaturalSkin = isNaturalSkin;
			return this;
		}
		
		@Override
		public Boots build () {
			return new Boots(id,productName,price,weight,color,productCount,size,isNaturalSkin);
		}
	}

	public int getSize() {
		return size;
	}

	public boolean isNaturalSkin() {
		return isNaturalSkin;
	}

	@Override
	public String toString() {
		return  size + "#" + isNaturalSkin + "#" + super.toString();
	}

	
	
	
	
}
