
package com.mac.bry.kurs1024kb.service;

import java.util.ArrayList;
import java.util.List;

import com.mac.bry.kurs1024kb.api.ProductService;
import com.mac.bry.kurs1024kb.entity.Product;


public class ProductServiceImpl implements ProductService {

	private List<Product> productsList;

	public ProductServiceImpl() {
		productsList = new ArrayList<Product>();
	}

	public ProductServiceImpl(List<Product> products) {
		super();
		this.productsList = products;
	}

	public List<Product> getAllProducts() {
		return productsList;
	}

	public int getNumberOfProductsOnList() {
		return productsList.size();
	}

	public Product getProductByProductName(String productName) {
		Product tempProduct = null;
		for(Product product : productsList) {
			if(product.getProductName().equals(productName)) {
				tempProduct = product;
				break;
			}
		}
		return tempProduct;
	}

	public boolean isProductCountIsGreaterThenZero() {
		if(productsList.size() == 0 ) {
			return false;
		}
		else return true;
	}

	public boolean isProducWithProductNameExist(String productName) {
		boolean tempAnswer = false;
		for (Product pro : productsList) {
			if (pro.getProductName().equals(productName)) {
				return tempAnswer = true;
			}
		}
		return tempAnswer;	
	}

	public boolean isProductWithProductIdExist(int productId) {
		boolean tempAnswer = false;
		for (Product pro : productsList) {
			if (pro.getId() == productId) {
				return tempAnswer = true;
			}
		}
		return tempAnswer;
	}

}
