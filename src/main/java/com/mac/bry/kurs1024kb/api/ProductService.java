package com.mac.bry.kurs1024kb.api;

import java.io.IOException;
import java.util.List;

import com.mac.bry.kurs1024kb.entity.Product;

public interface ProductService {

	List<Product> getAllProducts() throws IOException;
	
	int getNumberOfProductsOnList();
	
	Product getProductByProductName(String productName) throws IOException;
	
	boolean isProductCountIsGreaterThenZero();
	
	boolean isProducWithProductNameExist(String productName) throws IOException;
	
	boolean isProductWithProductIdExist(int productId) throws IOException;
}
