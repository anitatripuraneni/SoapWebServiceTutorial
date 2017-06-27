package com.soap.ws.service;

import java.util.ArrayList;
import java.util.List;

import com.soap.ws.model.Product;

public class ProductServiceImpl {
	List<String> bookList = new ArrayList<>();
	List<String> moviesList = new ArrayList<>();
	List<String> musicList = new ArrayList<>();

	public ProductServiceImpl() {
		bookList.add("book1");
		bookList.add("book2");
		bookList.add("book3");
		
		moviesList.add("movie1");
		moviesList.add("movie2");
		moviesList.add("movie3");
		
		musicList.add("music1");
		musicList.add("music2");
		musicList.add("music3");
		
	}

	public List<String> getProductCategories() {
		List<String> categories = new ArrayList<>();
		categories.add("books");
		categories.add("Movies");
		categories.add("grooceries");
		return categories;
	}

	
	public List<String> getProducts(String category){
		switch(category.toLowerCase()){
		case "books":
			return bookList;
		case "movies":
			return moviesList;
		case "music":
			return musicList;
		}
		return null;
	}
	
	public boolean addProduct(String category,String product){
		switch(category.toLowerCase()){
		case "books":
			bookList.add(product);
			break;
		case "movies":
			moviesList.add(product);
			break;
		case "music":
			musicList.add(product);
			break;
			default:
				return false;
		}
		return true;
	}
	
	public List<Product> getProductsV2(String category) {
		List<Product> productList = new ArrayList<>();
		productList.add(new Product("book1", "book of java", 3423.4));
		productList.add(new Product("book2", "book of C#", 256.4));
		productList.add(new Product("book3", "book of C++", 789.9));
		return productList;
	}
}
