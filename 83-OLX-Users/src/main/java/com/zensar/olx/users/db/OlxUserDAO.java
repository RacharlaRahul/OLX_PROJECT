package com.zensar.olx.users.db;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zensar.olx.users.bean.LoginUser;
import com.zensar.olx.users.bean.OLXUser;

@Repository
public interface OlxUserDAO extends JpaRepository<OLXUser, Integer>  {
	OLXUser findByUserName(String userName);
}
