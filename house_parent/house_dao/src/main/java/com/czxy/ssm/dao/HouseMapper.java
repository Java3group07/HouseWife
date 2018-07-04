package com.czxy.ssm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.czxy.ssm.pojo.House;

import tk.mybatis.mapper.common.Mapper;

public interface HouseMapper extends Mapper<House>{
@Select("select * from h_house where state = #{state}")
	List<House> findById(Integer state);
@Select("SELECT * FROM h_house ORDER BY hot_num DESC ")
List<House> findAll();


@Select("SELECT * FROM h_house WHERE house_name LIKE #{houseName}")
List<House> findhouseByName(String houseName);

}
