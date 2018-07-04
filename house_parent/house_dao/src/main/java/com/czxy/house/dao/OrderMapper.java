package com.czxy.house.dao;

import java.util.List;

import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.czxy.house.domain.House;
import com.czxy.house.domain.Order;

import tk.mybatis.mapper.common.Mapper;

public interface OrderMapper extends Mapper<Order>{

	
	/**
	 * 查询所有的订单
	 * @return
	 */
	@Select("SELECT * FROM h_order")
	@Results({
		@Result(property="house",column="hid",one=@One(select=("com.czxy.house.dao.HouseMapper.findByHid")))
	})
	List<Order> findAllByOrder();
	
	
	/**
	 * 待付款  和 已完成
	 * @param state
	 * @return
	 */
	@Select("SELECT *FROM h_order WHERE state=#{state}")
	@Results({
		@Result(property="house",column="hid",one=@One(select=("com.czxy.house.dao.HouseMapper.findByHid")))
	})
	List<Order>findAllByPayment(Integer state);
	
	
	
	/**
	 * 根据hid查询房屋信息
	 * @return
	 */
    @Select("select * from h_house where hid=#{hid}")
	House findHouseByHid(Integer hid);
  
}
