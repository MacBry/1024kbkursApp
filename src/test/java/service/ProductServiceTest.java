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
	
	@Test
	public void testPositiveIsProductCountIsGreaterThenZero() {
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
		
		products.add(product);
		
		//then
		ProductServiceImpl productServiceImpl = new ProductServiceImpl(products);
		boolean isPrductCountIsGreaterThenZeroInTestClass = productServiceImpl.isProductCountIsGreaterThenZero();
		
		//expected
		Assert.assertEquals(true, isPrductCountIsGreaterThenZeroInTestClass);
		
	}
	
	@Test
	public void testNegativeIsProductCountIsGreaterThenZero() {
		//is
		List<Product> products = new ArrayList<Product>();
		
		//then
		ProductServiceImpl productServiceImpl = new ProductServiceImpl(products);
		boolean isPrductCountIsGreaterThenZeroInTestClass = productServiceImpl.isProductCountIsGreaterThenZero();
		
		//expected
		Assert.assertEquals(false, isPrductCountIsGreaterThenZeroInTestClass);
		
	}
	
	@Test
	public void testPositiveIsProducWithProductNameExist() {
		//is
		List <Product> products = new ArrayList<Product>();
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
		
		boolean isProductWithProductNameExistInProductList = false;
		for(Product pr : products) {
			if (pr.getProductName().equals("Spodnie")) {
				isProductWithProductNameExistInProductList = true;
			}
		}
		
		//then
		ProductServiceImpl productServiceImpl = new ProductServiceImpl(products);
		boolean isProductWithProductNameExistInTestClass = productServiceImpl.isProducWithProductNameExist("Spodnie");
		
		//expected
		Assert.assertEquals(isProductWithProductNameExistInProductList, isProductWithProductNameExistInTestClass);
	}
	
	@Test
	public void testNegativeIsProducWithProductNameExist() {
		//is
		List <Product> products = new ArrayList<Product>();
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
		boolean isProductWithProductNameExistInTestClass = productServiceImpl.isProducWithProductNameExist("Kitel");
		
		//expected
		Assert.assertNotEquals(true, isProductWithProductNameExistInTestClass);
	}
	
	@Test
	public void testPositiveIsProducWithProductIdExist() {
		//is
		List <Product> products = new ArrayList<Product>();
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
		
		boolean isProductWithProductIdExistInProductList = false;
		for(Product pr : products) {
			if (pr.getId() == 1) {
				isProductWithProductIdExistInProductList = true;
			}
		}
		
		//then
		ProductServiceImpl productServiceImpl = new ProductServiceImpl(products);
		boolean isProductWithProductIdExistInTestClass = productServiceImpl.isProductWithProductIdExist(1);
		
		//expected
		Assert.assertEquals(true, isProductWithProductIdExistInTestClass);
	}
	
	@Test
	public void testNegativeIsProducWithProductIdExist() {
		//is
		List <Product> products = new ArrayList<Product>();
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
		boolean isProductWithProductIdExistInTestClass = productServiceImpl.isProductWithProductIdExist(3);
		
		//expected
		Assert.assertNotEquals(true, isProductWithProductIdExistInTestClass);
	}
	
}
