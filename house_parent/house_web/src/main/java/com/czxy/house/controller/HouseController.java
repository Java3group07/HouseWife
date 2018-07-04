package com.czxy.house.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.czxy.house.domain.House;
import com.czxy.house.service.HouseService;
import com.czxy.house.service.OrderService;

@Controller
@RequestMapping(path="/house")
public class HouseController {

	@Resource
	private HouseService houseService;
	
	@Resource
	private OrderService orderService;
	/**
	 * 查询所有房屋信息
	 * @param model
	 * @return
	 */
	@RequestMapping(path="/findAll.do")
	public String findAll(Model model){
		List<House> list = houseService.findAll();
		model.addAttribute("list", list);
		return "index";
	}
	
	/**
	 * 根据房屋的状态查询房屋信息
	 * @param model
	 * @param state
	 * @return
	 */
	@RequestMapping(path="/findById.do")
	public String findById(Model model, Integer state){
		List<House> list = houseService.findById(state);
		model.addAttribute("list", list);
		return "entire";
	}
	
	/**
	 * 根据房屋id查询房屋的详细信息
	 * @param model
	 * @param hid
	 * @return
	 */
	@RequestMapping(path="/findHouseById.do")
	public String findHouseById(Model model, Integer hid){
		House house= houseService.findHouseById(hid);
		List<House> list = houseService.findAll();
		model.addAttribute("list", list);
		model.addAttribute("house", house);
		return "house-details";
	}
	
	
	/**
	 * 查找所有委托信息
	 * @return
	 */
	@RequestMapping(path="/findAllLandLord.do")
	public ModelAndView findAllLandLord(){
		List<House> list = houseService.findAll();
		  ModelAndView mv=new ModelAndView();
		  mv.addObject("list",list);
		  mv.setViewName("entrust");
		  return mv;
	}
		/**
		 * 查询所有房屋信息
		 * 状态为0时，查看所有房屋信息
		 * @param district
		 * @param request
		 * @return
		 */
		@RequestMapping(path="/SelectAllDistrict.do")
		public String SelectAllDistrict(House house,HttpServletRequest request){
			List<House> dlist=houseService.selectAllDistrict(house);
			request.setAttribute("dlist", dlist);
			return "schedule";
		}
	
		/**
		 * 点击房东查询所有房屋信息
		 * @return
		 */
		@RequestMapping(path="/findAllHouse.do")
		public ModelAndView findAllHouse(){
			List<House> list = houseService.findAll();
			ModelAndView mv = new ModelAndView();
			mv.addObject("list", list);
			mv.setViewName("landlord");
			return mv;
		}
		/**
		 * 模糊查询
		 * @param houseName
		 * @param model
		 * @return
		 */
		@RequestMapping(path="/findHouseByName.do",method=RequestMethod.GET)
		public @ResponseBody List<House> findHouseByName( String housename,Model model){
			
			try {
				housename = URLDecoder.decode(housename, "UTF-8");
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			List<House> list = houseService.findHouseByName(housename);
			return list;
		}
		
		
		
		/**
		 * 根据hid查询房源信息跳转到订单页面
		 * @return
		 */
		@RequestMapping(path="/findAllHouse1.do")
		public ModelAndView findAllHouse1(Integer hid){
	        House house=orderService.findHouseByHid(hid);
			ModelAndView mv = new ModelAndView();
			mv.addObject("house", house);
			mv.setViewName("order");
			return mv;
		}
}
