package com.soap.ws;

import javax.xml.ws.Endpoint;

public class ProductCatalogPublisher {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:1234/productcatalog", new ProductCatalog());
	}

}
