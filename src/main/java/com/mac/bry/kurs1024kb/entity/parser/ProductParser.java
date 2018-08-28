package com.mac.bry.kurs1024kb.entity.parser;

import java.math.BigDecimal;

import com.mac.bry.kurs1024kb.entity.Boots;
import com.mac.bry.kurs1024kb.entity.Cloth;
import com.mac.bry.kurs1024kb.entity.Product;

public class ProductParser {
public static final String SEPARATOR = "#";
	
	public static Product stringToProduct(String productString, String productType) {
		if(productType == "PRODUCT") {
			return convertToProduct(productString);
		}
		else if (productType == "BOOTS") {
			return convertToBoots(productString);
		}
		else if (productType == "CLOTH") {
			return convertToCloth(productString);
		}
		return null;
	}

	private static Product convertToCloth(String productString) {
		String [] tempArr = productString.split(SEPARATOR);
		Product tempCloth = new Cloth.ClothBuilder()
				.setSize(Integer.parseInt(tempArr[0]))
				.setMaterial(tempArr[1])
				.setId(Integer.parseInt(tempArr[2]))
				.setProductName(tempArr[3])
				.setPrice(new BigDecimal(tempArr[4]))
				.setWeight(Double.parseDouble(tempArr[5]))
				.setColor(tempArr[6])
				.setProductCount(Integer.parseInt(tempArr[7]))
				.build();
		
		return tempCloth;
	}

	private static Product convertToBoots(String productString) {
		String [] tempArr = productString.split(SEPARATOR);
		Product tempBoots = new Boots.BootsBuilder()
				.setSize(Integer.parseInt(tempArr[0]))
				.setIsNaturalSkin(Boolean.parseBoolean(tempArr[1]))
				.setId(Integer.parseInt(tempArr[2]))
				.setProductName(tempArr[3])
				.setPrice(new BigDecimal(tempArr[4]))
				.setWeight(Double.parseDouble(tempArr[5]))
				.setColor(tempArr[6])
				.setProductCount(Integer.parseInt(tempArr[7]))
				.build();
		
		return tempBoots;
	}

	private static Product convertToProduct(String productString) {
		String [] tempArr = productString.split(SEPARATOR);
		Product tempProduct = new Product.Builder()
				.setId(Integer.parseInt(tempArr[0]))
				.setProductName(tempArr[1])
				.setPrice(new BigDecimal(tempArr[2]))
				.setWeight(Double.parseDouble(tempArr[3]))
				.setColor(tempArr[4])
				.setProductCount(Integer.parseInt(tempArr[5]))
				.build();
		
		return tempProduct;
		
		
	}
}

