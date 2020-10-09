package com.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.bean.Department;
import com.product.bean.ProductBean;
import com.product.repo.DepartmentRepo;
import com.product.repo.ProductRepo;

@RequestMapping("/product")
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ProductController {

	@Autowired
	ProductRepo repository; 
	@Autowired
	DepartmentRepo departRepository; 
	
	@GetMapping("/all")
	public List<ProductBean> getProducts() {

		return repository.findAll();
	}
	
	//11234,
	@GetMapping("/item/{itemId}")
	public ProductBean getProductByItemId(@PathVariable Long itemId) {
		
		return repository.findById(itemId).orElse(null);
	}
	
//	//Shirts
//	@GetMapping("/dept/{deptName}")
//	public Department getProductBydeptName(@PathVariable String deptName) {
//		
//		
//		return departRepository.findByDeptName(deptName);
//	}
	//Shirts
	@GetMapping("/dept/{deptName}")
	public ProductBean getProductBydeptName(@PathVariable String deptName) {
		
		Department deptId = departRepository.findByDeptName(deptName);
		
		//product repo
//		return repository.findProductByDeptDeptId(100L);
		return repository.getOne(11234L);
	}
}








