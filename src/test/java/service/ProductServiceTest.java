package service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.mac.bry.kurs1024kb.entity.Product;
import com.mac.bry.kurs1024kb.service.ProductServiceImpl;

public class ProductServiceTest {
	
	@Test
	public void testPositiveGetAllProducts() {
		//is
		List<Product> products = new ArrayList<Product>();
		Product product = new Product.Builder()
				.setId(1)
				.setProductName("buty")
				.setPrice(new BigDecimal("1522.80"))
				.setWeight(10)
				.setColor("czerwony")
				.setProductCount(1)
				.build();
		
		Product product1 = new Product.Builder()
				.setId(1)
				.setProductName("Spodnie")
				.setPrice(new BigDecimal("500.80"))
				.setWeight(2)
				.setColor("Czarne")
				.setProductCount(10)
				.build();
		
		products.add(product);
		products.add(product1);
		
		//then
		ProductServiceImpl productServiceImpl = new ProductServiceImpl(products);
		List<Product> productListFromTestclass = productServiceImpl.getAllProducts();
		
		//expected
		Assert.assertEquals(products, productListFromTestclass);
	}
	
	@Test
	public void testNegativeGetAllProducts() {
		//is
		List<Product> products = new ArrayList<Product>();
		List<Product> products1 = new ArrayList<Product>();
		Product product = new Product.Builder()
				.setId(1)
				.setProductName("buty")
				.setPrice(new BigDecimal("1522.80"))
				.setWeight(10)
				.setColor("czerwony")
				.setProductCount(1)
				.build();
		
		Product product1 = new Product.Builder()
				.setId(1)
				.setProductName("Spodnie")
				.setPrice(new BigDecimal("500.80"))
				.setWeight(2)
				.setColor("Czarne")
				.setProductCount(10)
				.build();
		
		products.add(product);
		products1.add(product1);
		
		//then
		ProductServiceImpl productServiceImpl = new ProductServiceImpl(products);
		List <Product> productsListFromTestClass = productServiceImpl.getAllProducts();
		
		//expected
		Assert.assertNotEquals(products1, productsListFromTestClass);
	}
	
	@Test
	public void testPositiveGetNumberOfProductsOnList() {
		//is
		List<Product> products = new ArrayList<Product>();
		Product product = new Product.Builder()
				.setId(1)
				.setProductName("buty")
				.setPrice(new BigDecimal("1522.80"))
				.setWeight(10)
				.setColor("czerwony")
				.setProductCount(1)
				.build();
		
		Product product1 = new Product.Builder()
				.setId(1)
				.setProductName("Spodnie")
				.setPrice(new BigDecimal("500.80"))
				.setWeight(2)
				.setColor("Czarne")
				.setProductCount(10)
				.build();
		products.add(product);
		products.add(product1);
		
		
		//then
		ProductServiceImpl productServiceImpl = new ProductServiceImpl(products);
		int numberOfProductsInTestClass = productServiceImpl.getNumberOfProductsOnList();
		
		//expected
		Assert.assertEquals(2, numberOfProductsInTestClass);
	}
	
	@Test
	public void testNegativeGetNumberOfProductsOnList() {
		//is
		List<Product> products = new ArrayList<Product>();
		Product product = new Product.Builder()
				.setId(1)
				.setProductName("buty")
				.setPrice(new BigDecimal("1522.80"))
				.setWeight(10)
				.setColor("czerwony")
				.setProductCount(1)
				.build();
		
		Product product1 = new Product.Builder()
				.setId(1)
				.setProductName("Spodnie")
				.setPrice(new BigDecimal("500.80"))
				.setWeight(2)
				.setColor("Czarne")
				.setProductCount(10)
				.build();
		products.add(product);
		products.add(product1);
		
		
		//then
		ProductServiceImpl productServiceImpl = new ProductServiceImpl(products);
		int numberOfProductsInTestClass = productServiceImpl.getNumberOfProductsOnList();
		
		//expected
		Assert.assertNotEquals(1, numberOfProductsInTestClass);
	}
	
	@Test
	public void testPositiveGetProductByProductName() {
		//is
		List<Product> products = new ArrayList<Product>();
		Product product = new Product.Builder()
				.setId(1)
				.setProductName("buty")
				.setPrice(new BigDecimal("1522.80"))
				.setWeight(10)
				.setColor("czerwony")
				.setProductCount(1)
				.build();
		Product product1 = new Product.Builder()
				.setId(1)
				.setProductName("Spodnie")
				.setPrice(new BigDecimal("500.80"))
				.setWeight(2)
				.setColor("Czarne")
				.setProductCount(10)
				.build();
		products.add(product);
		products.add(product1);
		
		Product SearchProduct = product;
		
		//then
		ProductServiceImpl productServiceImpl = new ProductServiceImpl(products);
		Product SearchProductFromTestClass = productServiceImpl.getProductByProductName(product.getProductName());
		
		//expected
		Assert.assertEquals(SearchProduct, SearchProductFromTestClass);
	}
	
	@Test
	public void testNegativeGetProductByProductName() {
		//is
		List<Product> products = new ArrayList<Product>();
		Product product = new Product.Builder()
				.setId(1)
				.setProductName("buty")
				.setPrice(new BigDecimal("1522.80"))
				.setWeight(10)
				.setColor("czerwony")
				.setProductCount(1)
				.build();
		Product product1 = new Product.Builder()
				.setId(1)
				.setProductName("Spodnie")
				.setPrice(new BigDecimal("500.80"))
				.setWeight(2)
				.setColor("Czarne")
				.setProductCount(10)
				.build();
		products.add(product);
		
		
		Product SearchProduct = product1;
		
		//then
		ProductServiceImpl productServiceImpl = new ProductServiceImpl(products);
		Product SearchProductFromTestClass = productServiceImpl.getProductByProductName(product.getProductName());
		
		//expected
		Assert.assertNotEquals(SearchProduct, SearchProductFromTestClass);
	}
}
