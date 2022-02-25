package com.zensar.olx.advertises.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.olx.advertises.bean.AdvertisementPost;
import com.zensar.olx.advertises.db.AdvertisementPostDAO;

@Service
public class AdvertisementPostService {
	
	@Autowired
	AdvertisementPostDAO dao;
	
	public AdvertisementPost addadvertisementPost(AdvertisementPost post) {
		return this.dao.save(post);
	}
	
	public AdvertisementPost updateAdvertisement(AdvertisementPost post) {
		return this.dao.save(post);
	}
	
	public List<AdvertisementPost> getAllAdvertisments(){
		return this.dao.findAll();
	}
	
	public boolean deleteAdvertisementPost(AdvertisementPost post) {
		boolean result=false;
		try {
			this.dao.delete(post);
		}catch (Exception e) {
			e.printStackTrace();
			result=false;
		}
		return result;
	}
	
	public AdvertisementPost getAdvertisementPostById(int id) {
		Optional<AdvertisementPost> optional= this.dao.findById(id);
		if(optional.isPresent())
			return optional.get();
		return null;
	}
}
