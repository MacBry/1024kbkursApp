
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
		return false;
	}

	public boolean isProducWithProductNameExist() {
		return false;
	}

	public boolean isProductWithProductIdExist() {
		return false;
	}

}
