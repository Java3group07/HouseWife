package com.czxy.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.czxy.house.dao.SubscribeDao;
import com.czxy.house.domain.Subscribe;
import com.czxy.house.service.SubscribeService;
@Transactional
@Service
public class SubscribeServiceImpl implements SubscribeService{
	@Resource
	private SubscribeDao subscribeDao;

	/**
	 * 添加房屋预约信息
	 */
	public void addSubscribe(Subscribe subscribe) {
		subscribeDao.insert(subscribe);
		
	}

}
