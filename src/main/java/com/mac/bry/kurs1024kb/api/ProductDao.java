package com.mac.bry.kurs1024kb.api;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import com.mac.bry.kurs1024kb.entity.Product;

public interface ProductDao {
	
	public void saveProduct(Product product) throws FileNotFoundException, IOException;
	
	public void saveProducts(List<Product> products) throws FileNotFoundException, IOException;
	
	public void removeProductById(int productId) throws FileNotFoundException, IOException;
	
	public void removeProductByName(String productName) throws IOException;
	
	public List<Product>getAllProducts() throws FileNotFoundException, IOException;
	
	public Product getProductById(int productId) throws IOException;
	
	public Product getProductByProductName(String productName) throws IOException;
	
	public int getNumberOfProducts () ;
	
}
