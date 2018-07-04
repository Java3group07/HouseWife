package com.czxy.house.service;

import com.czxy.house.domain.Landlord;

public interface LandlordService {
    
	/**
	 * 插入数据
	 * @param landlord
	 */
	void insertRecord(Landlord landlord);
     
	 /**
	  * 房东提交委托信息
	  * @param landlord
	  */
	void addLandlord(Landlord landlord);
}
