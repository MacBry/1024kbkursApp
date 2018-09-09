
package com.mac.bry.kurs1024kb.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.mac.bry.kurs1024kb.api.ProductService;
import com.mac.bry.kurs1024kb.dao.ProductDaoImpl;
import com.mac.bry.kurs1024kb.entity.Product;


public class ProductServiceImpl implements ProductService {

	private static ProductServiceImpl instance = null;
	
	private ProductDaoImpl productDaoImpl;

	
	public static ProductServiceImpl getInstance(String fileName, String productType) {
		if(instance == null) {
			instance = new ProductServiceImpl(fileName, productType);
		}
		return instance;
	}

	private ProductServiceImpl(String fileName, String productType) {
		try {
			this.productDaoImpl = ProductDaoImpl.getInstance(fileName, productType);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

	public List<Product> getAllProducts() throws IOException {
		return productDaoImpl.getAllProducts();
	}

	public int getNumberOfProductsOnList() {
		return productDaoImpl.getNumberOfProducts();
	}

	public Product getProductByProductName(String productName) throws IOException {
		return productDaoImpl.getProductByProductName(productName);
	}

	public boolean isProductCountIsGreaterThenZero() {
		if(productDaoImpl.getNumberOfProducts() > 0) {
			return true;
		}
		else return false;
	}

	public boolean isProducWithProductNameExist(String productName) throws IOException {
		boolean tempAnswer = false;
		if(productDaoImpl.getProductByProductName(productName) != null) {
			tempAnswer = true;
			return tempAnswer;
		}
		return tempAnswer;	
	}

	public boolean isProductWithProductIdExist(int productId) throws IOException {
		boolean tempAnswer = false;
		if(productDaoImpl.getProductById(productId) != null) {
			tempAnswer = true;
			return tempAnswer;
		}
		return tempAnswer;
	}

}
