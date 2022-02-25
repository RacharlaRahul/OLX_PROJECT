package com.zensar.olx.maters.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.olx.maters.bean.AdvertisementStatus;
import com.zensar.olx.maters.db.AdvertisementStatusDAO;

@Service
public class AdvertisementService {
	
	@Autowired
	AdvertisementStatusDAO dao;
	
	public AdvertisementStatus addAdvertisementStatus(AdvertisementStatus status) {
		return this.dao.save(status);
	}
	
	public List<AdvertisementStatus> findAllCategories(){
		return this.dao.findAll(); 
	}
	
	public AdvertisementStatus findAdvertisementStatus(int id) {
		Optional<AdvertisementStatus> optional=this.dao.findById(id);
		if(optional.isPresent())
			return optional.get();
		return null;
	}
}
