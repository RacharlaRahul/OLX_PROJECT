package com.zensar.olx.users.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.olx.users.bean.OLXUser;
import com.zensar.olx.users.db.OlxUserDAO;

@Service
public class OlxUserService {
	
	@Autowired
	OlxUserDAO dao;
	
	public OlxUserDAO getDao() {
		return dao;
	}

	public void setDao(OlxUserDAO dao) {
		this.dao = dao;
	}

	public OLXUser addOLXUser(OLXUser user) {
		return this.dao.save(user);
	}
	
	public OLXUser updateOLXUser(OLXUser user) {
		return this.dao.save(user);
	}
	
	public OLXUser findById(int id) {
		Optional<OLXUser> optional=this.dao.findById(id);
		if(optional.isPresent())
			return optional.get();
		else
			return null;
	}
	
	public OLXUser findOlxUserByName(String name) {
		return this.dao.findByUserName(name);
	}
	
	
	 //public List<OLXUser> findAllPersons(){ return this.dao.findAll(); }
	 
}
