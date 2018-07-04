package com.czxy.house.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.czxy.house.domain.Subscribe;
import com.czxy.house.domain.User;
import com.czxy.house.service.SubscribeService;
import com.czxy.house.service.UserService;

@Controller
@RequestMapping(path="/subscribe")
public class SubscribeController {
	//用户
	@Resource
	private UserService userService;
	
	@Resource
	private SubscribeService subscribeService;
	/**
	 * 预约房屋
	 */
	@RequestMapping(path="/addSubscribe.do")
	public String addSubscribe(Subscribe subscribe,HttpSession session){
		/**
		 * 先判断是否登录，
		 *如果未登录就跳转到登录页面
		 *如果登录就直接看房
		 */
		User user  = (User)session.getAttribute("u");
		if(user == null){
			return "sign";
		}
		System.out.println(subscribe);
		subscribeService.addSubscribe(subscribe);
		return "order-success";
	}
	
	

}
