package com.availability.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.availability.demo.bean.Availiability;


@RestController
@RequestMapping("/availabilty")
public class AvailabilityController {

	
	@Autowired
	ProductProxy productProxy;
	
	@Autowired
	BalanceProxy balanceProxy;
	
	@GetMapping("/product/{itemId}")
	public Availiability getAvailability(@PathVariable Long itemId) {
		
		Availiability response = productProxy.getProductByItemId(itemId);
		
		
//		response.setBalance(balanceProxy.getProductBalanceByItemId(itemId));
		
		
		return new Availiability (response.getProductId(), response.getProductName(),
								  response.getDeptId(), response.getDeptName(),
								  response.getLocationId(), response.getLocationName(),
								  response.getZipcode(), response.getBalance());
	}
}
