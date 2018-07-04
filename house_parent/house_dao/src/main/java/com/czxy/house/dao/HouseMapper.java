package com.czxy.house.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.czxy.house.domain.House;

import tk.mybatis.mapper.common.Mapper;

public interface HouseMapper extends Mapper<House> {

	/**
	 * 根据状态查询房屋信息
	 * @param state
	 * @return
	 */
	@Select("select * from h_house where state = #{state}")
	List<House> findById(Integer state);

	/**
	 * 查询并显示热门房源推荐
	 * @return
	 */
	@Select("SELECT * FROM h_house ORDER BY hotnum DESC ")
	List<House> findAll();
	
	
	/**
	 * 根据hid查询房屋信息
	 * @param hid
	 * @return
	 */
	@Select("SELECT * FROM h_house WHERE  hid=#{hid}")
	  House findByHid(Integer hid);
	
	/**
	 * 模糊查询
	 * @param houseName
	 * @return
	 */
	@Select("SELECT * FROM h_house WHERE housename LIKE #{houseName}")
	List<House> findhouseByName(String houseName);
}
