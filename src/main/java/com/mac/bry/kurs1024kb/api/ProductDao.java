package com.mac.bry.kurs1024kb.api;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import com.mac.bry.kurs1024kb.entity.Product;

public interface ProductDao {
	
	public void saveProduct(Product product) throws FileNotFoundException, IOException;
	
	public void saveProducts(List<Product> products) throws FileNotFoundException, IOException;
	
	public void removeProductById(Long productId) throws FileNotFoundException, IOException;
	
	public void removeProductByName(String productName);
	
	public List<Product>getAllProducts() throws FileNotFoundException;
	
	public Product getProductById(Long productId);
	
	public Product getProductByProductName(String productName);
	
}
