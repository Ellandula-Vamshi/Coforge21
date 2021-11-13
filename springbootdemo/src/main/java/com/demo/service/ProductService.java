package com.demo.service;

import java.util.ArrayList;
import java.util.Optional;

import com.demo.pojo.Product;



public interface ProductService{
	
	
	Product CreatProductDetails(Product product); ///done
	
	
		Product addProductDetails(Product product);

		

		ArrayList<Product> ListOfProducts(Product product);  //pending

		

		void deleteProductById(long id); 

		
	     Optional<Product> getProductById(long id);  //pending

		
		void updateOfProductById(long id); //pending..
	
}
	