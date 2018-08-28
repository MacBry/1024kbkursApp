package com.mac.bry.kurs1024kb.dao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.mac.bry.kurs1024kb.api.ProductDao;
import com.mac.bry.kurs1024kb.entity.Product;
import com.mac.bry.kurs1024kb.utils.FileUtils;

public class ProductDaoImpl implements ProductDao {

	private String fileName;
	private String productType;

	public ProductDaoImpl(String fileName, String productType) throws IOException {
		super();
		this.fileName = fileName;
		this.productType = productType;
		FileUtils.createNewFile(fileName);
	}

	public void saveProduct(Product product) throws IOException  {
		
		FileOutputStream fileOutputStream = new FileOutputStream(fileName, true);
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

	public void removeProductById(Long productId) throws IOException {


	}

	public void removeProductByName(String productName) {
		// TODO Auto-generated method stub

	}

	public List<Product> getAllProducts() throws FileNotFoundException {
		List <Product> listOfProducts = new ArrayList<Product>();
		BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
	
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
