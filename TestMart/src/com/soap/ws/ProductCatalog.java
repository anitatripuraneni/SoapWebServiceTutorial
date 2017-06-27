package com.soap.ws;

import java.util.List;

import javax.jws.WebService;

import com.soap.ws.model.Product;
import com.soap.ws.service.ProductServiceImpl;

@WebService(endpointInterface = "com.soap.ws.ProductCatalogInterface",portName = "TestMartCatalogPort", serviceName = "TestMartCatalogService")
public class ProductCatalog implements ProductCatalogInterface {
	
	ProductServiceImpl productService = new ProductServiceImpl();

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.soap.ws.ProductCatalogInterface#getProductCategories()
	 */
	@Override

	public List<String> getProductCategories() {

		return productService.getProductCategories();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.soap.ws.ProductCatalogInterface#getProducts(java.lang.String)
	 */
	@Override
	public List<String> getProducts(String category) {
		return productService.getProducts(category);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.soap.ws.ProductCatalogInterface#addProduct(java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public boolean addProduct(String category, String product) {
		return productService.addProduct(category, product);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.soap.ws.ProductCatalogInterface#getProductsV2(java.lang.String)
	 */
	@Override

	public List<Product> getProductsV2(String category) {
		return productService.getProductsV2(category);
	}
}
