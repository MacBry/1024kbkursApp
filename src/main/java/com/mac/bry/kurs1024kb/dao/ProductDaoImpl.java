package com.mac.bry.kurs1024kb.dao;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.mac.bry.kurs1024kb.api.ProductDao;
import com.mac.bry.kurs1024kb.entity.Product;

public class ProductDaoImpl implements ProductDao {

	private String FileName;
	private FileOutputStream fileOutputStream;

	public ProductDaoImpl(String fileName) {
		super();
		FileName = fileName;
	}

	public void saveProduct(Product product) throws IOException  {
		
		FileOutputStream fileOutputStream = new FileOutputStream(FileName, true);
		PrintWriter printWriter = new PrintWriter(fileOutputStream);
		printWriter.write(product.toString());
		printWriter.close();
		fileOutputStream.close();
		
	}

	public void saveProducts(List<Product> products) throws IOException {
		
		FileOutputStream fileOutputStream = new FileOutputStream(FileName, true);
		PrintWriter printWriter = new PrintWriter(fileOutputStream);
		for (Product pr : products) {
			printWriter.write(pr.toString() + "\n");
		}
		printWriter.close();
		fileOutputStream.close();

	}

	public void removeProductById(Long productId) {
		// TODO Auto-generated method stub

	}

	public void removeProductByName(String productName) {
		// TODO Auto-generated method stub

	}

	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	public Product getProductById(Long productId) {
		// TODO Auto-generated method stub
		return null;
	}

	public Product getProductByProductName(String productName) {
		// TODO Auto-generated method stub
		return null;
	}

}
