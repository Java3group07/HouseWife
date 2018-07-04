package com.czxy.house.controller;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.czxy.house.domain.House;
import com.czxy.house.domain.Order;
import com.czxy.house.service.HouseService;
import com.czxy.house.service.OrderService;

@Controller
@RequestMapping(path="/order")
public class OrderController {

	@Resource
	private OrderService orderService;
	
	@Resource
	private HouseService houseService;

	/**
	 * 查询所有的订单
	 * 
	 * @return
	 */
	@RequestMapping(path = "/findAllByOrder.do")
	public ModelAndView findAllByOrder() {
		// 订单的查询所有
		List<Order> list = orderService.findAllByOrder();
		ModelAndView mv = new ModelAndView();
		mv.addObject("list", list);
		mv.setViewName("rent-order");
		return mv;
	}
	
	
	/**
	 * 待付款
	 */
	@RequestMapping(path = "/findByPayment.do")
	public ModelAndView findByPayment(Integer state) {
		List<Order> orders = orderService.findAllByPayment(state);
		ModelAndView mv = new ModelAndView();
		mv.addObject("list", orders);
		mv.setViewName("rent-order");
		return mv;
	}
	
	/**
	 * 删除订单
	 * 
	 * @param oid
	 * @return
	 */
	@RequestMapping(path = "/findAllByOrderId.do")
	public String findAllByOrderId(Integer oid) {
		orderService.findAllByOrderId(oid);
		return "redirect:/order/findAllByOrder.do";
	}
	
	
	/**
	 * 待评价
	 */
	@RequestMapping(path="findByAssess.do")
	public ModelAndView findByAssess(Integer state){
	  List<Order> orders=orderService.findAllByPayment(state);
	       ModelAndView mv=new ModelAndView();
	       mv.addObject("list",orders);
	       mv.setViewName("/empty-list");
		return mv;
	}
	
	/**
	 * 从order表中根据hid查房子的信息
	 从rent-order 表的待付款
	 * @param hid
	 * @return
	 */
	@RequestMapping(path="findAllHouseByOid.do")
	public ModelAndView findAllHouseByOid(Integer hid){
		House house=orderService.findHouseByHid(hid);
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("house", house);
		mv.setViewName("pay-rent");
		return mv;
	}
	
	/**
	pay-rent ajax异步校验来的
	 * ajax异步校验
	 * @param startTime
	 * @param endTime
	 * @return
	 */
	@RequestMapping(path="data.do")
	@ResponseBody
	public long data(Date startTime ,Date endTime){
		System.out.println(startTime);
		long time = startTime.getTime();
		long time2 = endTime.getTime();
		long time3 = time2-time;
		return time3;
	}
}
