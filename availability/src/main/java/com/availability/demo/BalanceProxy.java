package com.availability.demo;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.availability.demo.bean.Availiability;

@FeignClient(name ="zuul")
@RibbonClient(name="balance-service")
public interface BalanceProxy {

	@GetMapping("/balance-service/balance/product/{itemId}")
	public Availiability getProductBalanceByItemId(@PathVariable("itemId") Long itemId);
}
