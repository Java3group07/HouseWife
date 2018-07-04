package com.czxy.house.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.czxy.house.domain.House;
import com.czxy.house.domain.Landlord;
import com.czxy.house.service.HouseService;
import com.czxy.house.service.LandlordService;

@Controller
@RequestMapping(path="/landlord")
public class LandlordController {
  
	@Resource
	private LandlordService landlordService;
	
	@Resource
	private HouseService houseService;
	
	/**
	 * 查询所有出租的 房屋
	 * @return
	 */
	@RequestMapping(path="/show.do")
	public ModelAndView show(){
		List<House> list = houseService.findAll();
		ModelAndView mv = new ModelAndView();
		mv.addObject("list", list);
		mv.setViewName("lease");
		return mv;
	}
	
	
	/**
	 * 插入要出租 的房屋信息
	 * @param landlord
	 * @return
	 */
	@RequestMapping(path="/insert.do")
	public ModelAndView insertRecord(Landlord landlord){
		landlordService.insertRecord(landlord);
		ModelAndView mv=new ModelAndView();
		mv.setViewName("lease");
		return  mv;
	}
	
	/**
	 * 房东提交委托时
	 * @param landlord
	 * @return
	 */
	@RequestMapping(path="/addLandlord.do")
	public String addLandlord(Landlord  landlord){
		landlordService.addLandlord(landlord);
		return "landlord";
	}
}
