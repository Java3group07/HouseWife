package com.czxy.house.service;

import java.util.List; 

import com.czxy.house.domain.House;

public interface HouseService{

	/**
	 * 根据状态查询房屋信息
	 * @param state
	 * @return
	 */
	List<House> findById(Integer state);

	/**
	 * 查询所有房屋
	 * @return
	 */
	List<House> findAll();

	/**
	 * 根据房屋id查询房屋信息
	 * @param hid
	 * @return
	 */
	House findHouseById(Integer hid);
	
	List<House> selectAllDistrict(House house);
	
	/**
	 * 模糊查询
	 * @param houseName
	 * @return
	 */
	List<House> findHouseByName(String houseName);
}
