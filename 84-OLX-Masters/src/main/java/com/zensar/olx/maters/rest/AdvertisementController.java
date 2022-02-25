package com.zensar.olx.maters.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.olx.maters.bean.AdvertisementStatus;
import com.zensar.olx.maters.service.AdvertisementService;

@RestController
public class AdvertisementController {
	
	@Autowired
	AdvertisementService service;
	
	@PostMapping("/advertise/addStatus")
	public AdvertisementStatus addAdvertisementStatus(@RequestBody AdvertisementStatus status) {
		return this.service.addAdvertisementStatus(status);
	}
	
	@GetMapping("/advertise/status")
	public List<AdvertisementStatus> getAllStatus() {
		return this.service.findAllCategories();
	}
	
	@GetMapping("/advertise/status/{id}")
	public AdvertisementStatus findAdvertisementStatusById(@PathVariable(name="id") int id) {
		return this.service.findAdvertisementStatus(id);
	}
}
