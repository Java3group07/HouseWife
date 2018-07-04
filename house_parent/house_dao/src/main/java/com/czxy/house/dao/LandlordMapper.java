package com.czxy.house.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;

import com.czxy.house.domain.Landlord;

import tk.mybatis.mapper.common.Mapper;

public interface LandlordMapper  extends Mapper<Landlord>{
   
	/**
	 * 插入数据
	 * @param landlord
	 */
	@Insert("INSERT  INTO h_landlord VALUES (null,#{hid},#{username},#{phone},#{onhireDate},#{type},#{address},#{housetype},#{rent})")
     @Results({
    	 @Result(property="house",column="hid",one=@One(select=("com.czxy.dao.HouesMapper.findByHid")))
     })
	void insertRecord(Landlord landlord);
     
}
