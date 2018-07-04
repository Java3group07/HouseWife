package com.czxy.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.czxy.house.dao.OrderMapper;
import com.czxy.house.domain.House;
import com.czxy.house.domain.Order;
import com.czxy.house.service.OrderService;

@Service
@Transactional
public class OrderServiceImpl implements OrderService {

	@Resource
	private OrderMapper orderMapper;

	/**
	 * 查询所有订单
	 */
	/*public List<Order> findAllOrder() {
		List<Order> list = orderMapper.selectAll();
		return list;
	}*/
	
	/**
	 * 查询所有的订单(根据指定条件查询)
	 */
	public List<Order> findAllByOrder() {
		return orderMapper.findAllByOrder();
	}
	
	
	 /**
     * 待付款
     */
	public List<Order> findAllByPayment(Integer state) {
		
		return orderMapper.findAllByPayment(state);
	}
	
	
	/**
	 * 删除订单
	 */
	public void findAllByOrderId(Integer oid) {
 		orderMapper.deleteByPrimaryKey(oid);
	}
	
	/**
	 * 根据房屋id查询房屋信息
	 */
	public House findHouseByHid(Integer hid) {
		House house=orderMapper.findHouseByHid(hid);
		return house;
	}

}
