package com.czxy.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.czxy.house.dao.HouseMapper;
import com.czxy.house.domain.House;
import com.czxy.house.service.HouseService;

import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;

@Service
@Transactional
public class HouseServiceImpl implements HouseService{

	@Resource
	private HouseMapper houseMapper;
	
	/**
	 * 根据房屋的状态查询房屋
	 * @param state
	 * @return
	 */
	public List<House> findById(Integer state) {
		List<House> list =houseMapper.findById(state);
		return list;
	}

	/**
	 * 查询所有房屋
	 * @return
	 */
	public List<House> findAll() {
		
		return houseMapper.findAll();
	}

	/**
	 * 根据房源id查询房屋
	 * @param hid
	 * @return
	 */
	public House findHouseById(Integer hid) {
		House house = houseMapper.selectByPrimaryKey(hid);
		return house;
	}

	/**
	 * 状态为0时，查看所有房屋信息
	 * @param district
	 * @param request
	 * @return
	 */
	@Override
	public List<House> selectAllDistrict(House house) {
		//拼接条件
		Example e = new Example(House.class);
		Criteria c = e.createCriteria();
		//当状态为0时
		c.andEqualTo("situation", house.getSituation());
		//调用dao
		List<House> list = houseMapper.selectByExample(e);
		return list;
	}
	
	
	/**
	 * 模糊查询
	 */
	public List<House> findHouseByName(String houseName) {
		houseName="%"+houseName+"%";
		
		List<House> list = houseMapper.findhouseByName(houseName);
		return list;
	}

}
