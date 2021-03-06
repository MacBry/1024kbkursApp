package com.mac.bry.kurs1024kb.dao;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.management.InstanceAlreadyExistsException;

import com.mac.bry.kurs1024kb.api.ProductDao;
import com.mac.bry.kurs1024kb.entity.Product;
import com.mac.bry.kurs1024kb.entity.parser.ProductParser;
import com.mac.bry.kurs1024kb.utils.FileUtils;

public class ProductDaoImpl implements ProductDao {

	private static ProductDaoImpl instance = null;
	
	private String fileName;
	private String productType;
	
	public static ProductDaoImpl getInstance(String fileName, String productType) throws IOException {
		if(instance == null ) {
			instance = new  ProductDaoImpl(fileName, productType);
		}
		return instance;
	}
	
	private ProductDaoImpl(String fileName, String productType) throws IOException {
		this.fileName = fileName;
		this.productType = productType;
		FileUtils.createNewFile(fileName);
	}


	
	@Override
	public void saveProduct(Product product) throws IOException  {
		List<Product> productList = new ArrayList<Product>();
		productList = getAllProducts();
		productList.add(product);
		saveProducts(productList);
	}
	
	@Override
	public void saveProducts(List<Product> products) throws IOException {
		
		FileOutputStream fileOutputStream = new FileOutputStream(fileName, true);
		PrintWriter printWriter = new PrintWriter(fileOutputStream);
		for (Product pr : products) {
			printWriter.println(pr.toString());
			
		}
		printWriter.close();

	}

	@Override
	public void removeProductById(int productId) throws IOException {
		List <Product> listOfProducts = new ArrayList<Product>();
		
		for( int i = 0 ; i < listOfProducts.size() ; i ++) {
			boolean isFoundProduct = listOfProducts.get(i).getId() == productId;
			if (isFoundProduct) {
				listOfProducts.remove(i);
			}
		}
		saveProducts(listOfProducts);

	}
	
	@Override
	public void removeProductByName(String productName) throws IOException {
		List <Product> listOfProducts = getAllProducts();
		
		for( int i = 0 ; i < listOfProducts.size() ; i++) {
			boolean isFoundProduct = listOfProducts.get(i).getProductName() == productName;
			if (isFoundProduct) {
				listOfProducts.remove(i);
			}
		}
		saveProducts(listOfProducts);


	}

	@Override
	public List<Product> getAllProducts() throws IOException {
		List <Product> listOfProducts = new ArrayList<Product>();
		BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
		String readLine = bufferedReader.readLine();
		
		while (readLine != null) {
			Product product = ProductParser.stringToProduct(readLine, productType);
			if (product != null) {
				listOfProducts.add(product);
			}
			readLine = bufferedReader.readLine();
			
		}
		bufferedReader.close();
		return listOfProducts;
	}

	@Override
	public Product getProductById(int productId) throws IOException {
		List<Product> listOfProducts = getAllProducts();
		for (Product pr : listOfProducts) {
			boolean isFoundProduct = (pr.getId() == productId);
			if(isFoundProduct) {
				return pr;
			}
		}
		return null;
	}

	@Override
	public Product getProductByProductName(String productName) throws IOException {
		List<Product> listOfProducts = getAllProducts();
		for(Product pr : listOfProducts) {
			boolean isFoundProduct = (pr.getProductName().equals(productName));
			if(isFoundProduct) {
				return pr;
			}
		}
		return null;
	}

	@Override
	public int getNumberOfProducts()  {
		List<Product> listOfProducts = null;
		try {
			listOfProducts = getAllProducts();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return listOfProducts.size();
	}

}
