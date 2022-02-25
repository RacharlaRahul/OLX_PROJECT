package com.zensar.olx.users.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.olx.users.bean.OLXUser;
import com.zensar.olx.users.service.OlxUserService;

@RestController
public class OlxUserController {
	
	@Autowired
	OlxUserService olxUserService;
	
	@PostMapping(value="/user")
	public OLXUser addOlxUser(@RequestBody OLXUser user) {
		return this.olxUserService.addOLXUser(user);
	}
	
	@GetMapping(value="/user/{id}")
	public OLXUser findPerson(@PathVariable(name = "id") int id) {
		return this.olxUserService.findById(id);
	}
	
	@GetMapping("/user/find/{userName}")
	public OLXUser findOlxUserByName(@PathVariable(name="userName") String name) {
		return this.olxUserService.findOlxUserByName(name);
	}

}
