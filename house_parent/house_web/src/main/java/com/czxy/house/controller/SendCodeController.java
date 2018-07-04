package com.czxy.house.controller;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.czxy.house.util.RandomCode;
import com.czxy.house.util.SmsUtils;

@Controller
@RequestMapping(path="/send")
public class SendCodeController {

	@RequestMapping(path="/sendCode.do")
	public void sendCode(@RequestParam String telephone, HttpSession session) throws Exception{
		
		String code = RandomCode.genCode();
		//保存验证码到session域
		session.setAttribute("code", code);
		//使用工具类，发送手机验证码
		SmsUtils.sendSms(telephone, code);
		
	}
	
	@RequestMapping(path="/validateCode.do")
	public String  validateCode(@RequestParam(name="phoneVercode") String phoneVercode,HttpSession session,Model model) throws Exception{
	 	
		String  code = (String) session.getAttribute("code");
		
		if (!phoneVercode.equals(code)) {
			model.addAttribute("msg", "验证码不正确！");
			return "short";
		}
		return "lose";
	}
	
	
}
