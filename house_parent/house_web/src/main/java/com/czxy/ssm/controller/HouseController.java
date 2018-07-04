package com.czxy.ssm.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.czxy.ssm.pojo.House;
import com.czxy.ssm.service.HouseService;

@Controller
@RequestMapping(path="/house")
public class HouseController {
	
	@Resource
	private HouseService houseService;
	
	@RequestMapping(path="/findAll.do")
	public String findAll(Model model){
		List<House> list = houseService.findAll();
		model.addAttribute("list", list);
		return "index";
	}
	
	@RequestMapping(path="findById.do")
	public String findById(Model model, Integer state){
		List<House> list = houseService.findById(state);
		model.addAttribute("list", list);
		return "entire";
	}
	@RequestMapping(path="findHouseById.do")
	public String findHouseById(Model model, Integer hid){
		House house= houseService.findHouseById(hid);
		model.addAttribute("house", house);
		return "house-details";
	}
	//模糊查询
	@RequestMapping(path="/findHouseByName.do",method=RequestMethod.GET)
	public @ResponseBody List<House> findHouseByName( String houseName,Model model){
		
		try {
			houseName = URLDecoder.decode(houseName, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
//		JSONObject parse = (JSONObject) JSON.parse(houseName);
//		houseName = parse.getString("houseName");
		List<House> list = houseService.findHouseByName(houseName);
		return list;
	}
	
	

			
			
}
