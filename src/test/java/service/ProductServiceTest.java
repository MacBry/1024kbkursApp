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
}
