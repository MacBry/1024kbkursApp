package com.mac.bry.kurs1024kb.api;

import java.util.List;

import com.mac.bry.kurs1024kb.entity.Product;

public interface ProductService {

	List<Product> getAllProducts();
	
	int getNumberOfProductsOnList();
	
	Product getProductByProductName(String productName);
	
	boolean isProductCountIsGreaterThenZero();
	
	boolean isProducWithProductNameExist();
	
	boolean isProductWithProductIdExist();
}
