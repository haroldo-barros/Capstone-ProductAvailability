package com.balanceservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.balanceservice.bean.BalanceServiceBean;
import com.balanceservice.proxy.PoductProxy;
import com.balanceservice.repo.BalanceRepo;

@RestController
@RequestMapping("/balance")
public class BalanceServiceController {

	@Autowired
	PoductProxy proxy;
	
	@Autowired
	BalanceRepo repository;
	
	//11234,
	@GetMapping("/balance-product-feign/item/{itemId}")
	public BalanceServiceBean productBalanceFeign(@PathVariable Long itemId) {
		
		System.out.println("****************************");
		System.out.println("INSIDE \"/balance-product-feign/item/{itemId}\"");
		System.out.println("{itemId} = " + itemId);
		System.out.println("****************************");
		
		
		BalanceServiceBean response = proxy.getProductByItemId(itemId);
				
		System.out.println("****************************");
		System.out.println("after proxy");
		System.out.println("****************************");
		
		return new BalanceServiceBean(response.getBalanceId(),
									  response.getProduct(), 
									  response.getLocation(),
									  response.getBalanceAmount());
	}
	
	@GetMapping("/product/{itemId}")
	public BalanceServiceBean productBalance(@PathVariable Long itemId) {
		
		
		BalanceServiceBean response = repository.getBalanceByProductId(itemId);
		
//		return response.getBalance();
		
		return repository.getBalanceByProductId(itemId);
	}
	
	
	
}









