package com.availability.demo;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.availability.demo.bean.Availiability;

@FeignClient(name ="zuul")
@RibbonClient(name="product")
public interface ProductProxy {

	
//	@GetMapping("/products/item/{itemId}")
	@GetMapping("/product/products/item/{itemId}")
	public Availiability getProductByItemId(@PathVariable("itemId") Long itemId);
}
