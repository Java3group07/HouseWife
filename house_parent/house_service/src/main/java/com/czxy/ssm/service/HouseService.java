package com.czxy.ssm.service;

import java.util.List;

import com.czxy.ssm.pojo.House;

public interface HouseService {

	List<House> findById(Integer state);

	List<House> findAll();

	House findHouseById(Integer hid);

	List<House> findHouseByName(String houseName);

}
