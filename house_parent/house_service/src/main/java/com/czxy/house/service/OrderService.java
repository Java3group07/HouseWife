package com.czxy.house.service;

import java.util.List;

import com.czxy.house.domain.House;
import com.czxy.house.domain.Order;


public interface OrderService {

	/**
	 * 查询所有订单
	 * @return
	 */
//	public List<Order> findAllOrder();
	
	
	
	/**
	 * 查询所有的订单(根据条件查询)
	 * @return
	 */
	List<Order> findAllByOrder();
	
	/**
	 * 待付款
	 * @param state
	 * @return
	 */
	List<Order> findAllByPayment(Integer state);
	
	/**
	 * 删除订单
	 * @param oid
	 */
	void findAllByOrderId(Integer oid);
	
	/**
	 * 通过房源id查询房屋信息
	 * @param hid
	 * @return
	 */
	House findHouseByHid(Integer hid);
}
