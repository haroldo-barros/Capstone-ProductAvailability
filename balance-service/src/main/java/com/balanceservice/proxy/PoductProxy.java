package com.balanceservice.proxy;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.balanceservice.bean.BalanceServiceBean;

//@FeignClient(name ="product")
@FeignClient(name ="zuul")
//@RibbonClient(name="product")
public interface PoductProxy {
	
//	@GetMapping("/products/item/{itemId}")
	@GetMapping("/product/products/item/{itemId}")
	public BalanceServiceBean getProductByItemId(@PathVariable("itemId") Long itemId);
}













