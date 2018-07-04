package com.czxy.ssm.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.czxy.ssm.pojo.User;
import com.czxy.ssm.service.UserService;

@Controller
@RequestMapping(path = "/user")
public class UserController {

	@Resource
	private UserService userService;

	@RequestMapping(path = "/update1.do")
	public String update1(Model model, HttpSession session, User u, @RequestParam String checkCode) {
		String verCode = (String) session.getAttribute("verCode");
		if (verCode.equalsIgnoreCase(checkCode)) {
			User user = userService.update1(u.getUsername());
			if (user != null) {
				session.setAttribute("user", user);
				return "forward:/pages/short.jsp";
			}
			model.addAttribute("msg", "用户名输入有误,请重新输入");
			return "modify";
		} else {
			model.addAttribute("msg", "验证码有误,请重新输入");
			return "modify";
		}
	}

	@RequestMapping(path = "/updatePwd.do")
	public String updatePwd(User user) {
		userService.updatePwd(user);
		return "complete";
	}
	
	@RequestMapping(path="/findUserNum.do")
	public @ResponseBody Integer findUserNum(){
		
		int num = userService.findUserNum();
		
		return num;
	}

}
