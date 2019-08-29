package com.jm.EhcacheApp.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.jm.EhcacheApp.entity.Product;
import com.jm.EhcacheApp.exception.ProductException;

@RestController
public class EhcacheController {
	
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/products/{productid}")
	public List<Product> getProducts(@PathVariable(value="productid") int productid) throws ProductException
	{
		String url="";
		List<Product>productList=new ArrayList();
		Product product=new Product();
		
		product.setProductid(productid);
		HttpHeaders httpHeaders=new HttpHeaders();
		httpHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		
		HttpEntity<Product> entity=new HttpEntity<Product>(product,httpHeaders);
		
		
		ResponseEntity<ArrayList>response=restTemplate.exchange(url, HttpMethod.GET,entity,ArrayList.class);
		productList=response.getBody();
		return productList;
		
	}

}
