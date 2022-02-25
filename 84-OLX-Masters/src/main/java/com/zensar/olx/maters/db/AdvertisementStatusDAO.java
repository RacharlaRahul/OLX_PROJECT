package com.zensar.olx.maters.db;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zensar.olx.maters.bean.AdvertisementStatus;

@Repository
public interface AdvertisementStatusDAO extends JpaRepository<AdvertisementStatus, Integer>{

}
