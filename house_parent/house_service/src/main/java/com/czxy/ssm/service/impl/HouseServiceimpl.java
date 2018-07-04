package com.czxy.ssm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.czxy.ssm.dao.HouseMapper;
import com.czxy.ssm.pojo.House;
import com.czxy.ssm.service.HouseService;

@Transactional
@Service
public class HouseServiceimpl  implements HouseService{
@Resource
private HouseMapper houseMapper;

@Override
public List<House> findById(Integer state) {
	List<House> list =houseMapper.findById(state);
	return list;
}

@Override
public List<House> findAll() {
	
	return houseMapper.findAll();
}

@Override
public House findHouseById(Integer hid) {
	House house = houseMapper.selectByPrimaryKey(hid);
	return house;
}

@Override
public List<House> findHouseByName(String houseName) {
	houseName="%"+houseName+"%";
	
	List<House> list = houseMapper.findhouseByName(houseName);
	return list;
}


}
