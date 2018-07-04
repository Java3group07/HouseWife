package com.czxy.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.czxy.house.dao.LandlordMapper;
import com.czxy.house.domain.Landlord;
import com.czxy.house.service.LandlordService;

@Service
@Transactional
public class LandlordServiceImpl implements LandlordService {
  
	@Resource
	private  LandlordMapper landlordMapper;

	 /**
	  * 插入数据
	  *
	  * */
	public void insertRecord(Landlord landlord) {
		landlordMapper.insertRecord(landlord);
		
	}

	/**
	 * 房东提交委托信息
	 * @param landLord
	 */
	public void addLandlord(Landlord landlord) {
		landlordMapper.insertRecord(landlord);
	}
}
