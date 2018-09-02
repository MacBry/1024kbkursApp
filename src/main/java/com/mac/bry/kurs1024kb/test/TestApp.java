package com.mac.bry.kurs1024kb.test;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.mac.bry.kurs1024kb.dao.ProductDaoImpl;
import com.mac.bry.kurs1024kb.entity.Boots;
import com.mac.bry.kurs1024kb.entity.Cloth;
import com.mac.bry.kurs1024kb.entity.Product;
import com.mac.bry.kurs1024kb.entity.User;
import com.mac.bry.kurs1024kb.service.ProductServiceImpl;

public class TestApp {

	public static void main(String[] args) throws IOException {
		
		Product product = new Product.Builder()
				.setId(1)
				.setProductName("buty")
				.setPrice(new BigDecimal("1522.80"))
				.setWeight(10)
				.setColor("czerwony")
				.setProductCount(1)
				.build();
		Product product1 = new Product.Builder()
				.setId(2)
				.setProductName("kurtka")
				.setPrice(new BigDecimal("1.80"))
				.setWeight(25)
				.setColor("czarny")
				.setProductCount(100)
				.build();
		
		//System.out.println(product);
		//System.out.println();
		
		User user = new User(1, "mac", "bry");
		
		//System.out.println(user);
		//System.out.println();
		
		Product boots = new Boots.BootsBuilder()
				.setSize(5)
				.setIsNaturalSkin(true)
				.setId(1)
				.setProductName("Addidas")
				.setPrice(new BigDecimal("155.2"))
				.setWeight(50)
				.setColor("Bia³y")
				.setProductCount(2)
				.build();
				
		
		//System.out.println(boots);
		//System.out.println();
		
		Product cloth = new Cloth.ClothBuilder()
				.setSize(42)
				.setMaterial("bawe³na")
				.setId(3)
				.setProductName("Koszula")
				.setPrice(new BigDecimal("128.36"))
				.setWeight(2)
				.setColor("Czarny")
				.setProductCount(100)
				.build();
				
		
		//System.out.println(cloth);
		//System.out.println();
		
		//file test
		ProductDaoImpl daoImpl = new ProductDaoImpl("Maciej84.txt", "PRODUCT");
		List <Product> productsList =  new ArrayList<Product>();
		
		productsList.add(product);
		productsList.add(product1);
		
		daoImpl.saveProducts(productsList);
		List <Product> productListFromFile = new ArrayList<Product>();
		productListFromFile = daoImpl.getAllProducts();
		
		System.out.println("Lista przeczytana z pliku");
		for (Product pr : productListFromFile) {
			System.out.println(pr.toString());
		}
	}

}
