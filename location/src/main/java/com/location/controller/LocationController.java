package com.location.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.location.bean.LocationBean;
import com.location.repo.LocationRepo;

@RestController
public class LocationController {

	@Autowired
	LocationRepo repository;
	
	@GetMapping("/locations")
	public List<LocationBean> getLocations(){
		
		return repository.findAll();
		
	}
	
	//500
	@GetMapping("/location/{id}")
	public LocationBean getLocationById(@PathVariable Long id){
		
		return repository.findById(id).orElse(null);
		
	}
}
